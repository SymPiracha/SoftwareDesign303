package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a deck of playing cards. In this version, the cards in the deck are stored in a list and the list of cards
 * in the deck can be obtained by client code using an immutable wrapper object.
 */
public class Deck implements Iterable<Card>
{

	private final List<Card> aCards = new ArrayList<>();
	private Undoer aUndoer = new Undoer();
 
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		System.out.println(deck.aCards.size());
		deck.shuffle(new RankBasedValidator(Rank.ACE));
		System.out.println(deck.aCards.size());
		deck.shuffle(new RankBasedValidator(Rank.TWO));
		System.out.println(deck.aCards.size());
		
	}
	
	public Deck()
	{
		shuffle(new RankBasedValidator(Rank.ACE));	
	}

	public void shuffle(CardValidator pValidator)
	{
		aCards.clear();
		for (Suit suit : Suit.values())
		{
			for (Rank rank : Rank.values())
			{
				Card card = Card.get(rank, suit);
				if ( pValidator.isValid(card)) 
				{
					aCards.add(Card.get(rank, suit));
				}
			}
		}
		Collections.shuffle(aCards);
		aUndoer.shuffled();
	
	}
	
	public static CardValidator byRankValidator(Rank pRank)
	{
		return new CardValidator()
		{
			@Override
			public boolean isValid(Card pCard)
			{
				return pCard.getRank().compareTo(pRank) >= 0;
			}
		};
	}
	
	public Card draw()
	{
		assert !isEmpty();
		Card card = aCards.remove(aCards.size() - 1);
		aUndoer.drawnCard(card);
		return card;
	}
	
	public void undo()
	{
		aUndoer.undo();
	}

	public boolean isEmpty()
	{
		return aCards.isEmpty();
	}

	public Iterator<Card> iterator()
	{
		return aCards.iterator();
	}
	
	class Undoer 
	{
		private List<Card> aDrawn = new ArrayList<>();
		 
		public void drawnCard(Card pCard)
		{
			aDrawn.add(pCard);
		}
		
		public void shuffled()
		{
			aDrawn = new ArrayList<>();
		}
		
		public void undo()
		{
			aCards.add(aDrawn.remove(aDrawn.size()-1));
		}
		
		
	}
}

class RankBasedValidator implements CardValidator
{
	private Rank aRank;
	public RankBasedValidator(Rank pRank)
	{
		aRank = pRank;
	}
	
	@Override
	public boolean isValid(Card pCard)
	{
		return pCard.getRank().compareTo(aRank) >= 0;
	}
	
}




