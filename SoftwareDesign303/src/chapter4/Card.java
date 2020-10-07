package chapter4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;



/**
 * Implementation of a playing card. This class yields immutable objects.
 * This version of the class also implements the Comparable interface and
 * compares cards by rank, with an undefined order for cards of the same rank.
 * The class also includes a static factory method to create Comparator
 * objects that can compare cards according to their rank.
 */
public class Card
{
	public enum Joker { WHITE, BLACK }
	private static Card aBlackJoker = new Card(Joker.BLACK);
	private static Card aWhiteJoker = new Card(Joker.WHITE);
	
	private static Map<Suit, Map<Rank, Card>> aCards = initialize(); //4
//	private static Map<Suit, Map<Rank, Card>> aCards = new HashMap<>(); //3
//	private static Map<Integer,Card> aCards = new HashMap<>(); //2
//	private static List<Card> aCards = new ArrayList<>(); //1
	
	private Optional<Rank> aRank = Optional.empty();
	private Optional<Suit> aSuit = Optional.empty();
	private Joker aJoker = Joker.BLACK;
	
	//4
	private static Map<Suit, Map<Rank,Card>> initialize() 
	{
		Map<Suit, Map<Rank, Card>> cards = new HashMap<>();
		for (Suit suit: Suit.values())
		{
			cards.put(suit, new HashMap<>());
			for (Rank rank: Rank.values())
			{
				cards.get(suit).put(rank, new Card(rank,suit));
			}
		}
		return cards;
	}
	
	/**
	 * Creates a new card object.
	 * 
	 * @param pRank The rank of the card.
	 * @param pSuit The suit of the card.
	 * @pre pRank != null
	 * @pre pSuit != null
	 */
	private Card(Rank pRank, Suit pSuit)
	{
		assert pRank != null && pSuit != null;
		aRank = Optional.of(pRank);
		aSuit = Optional.of(pSuit);
	}
	
	private Card(Joker pJoker)
	{
		aJoker = pJoker;
	}
	
	public static Card get(Rank pRank, Suit pSuit)
	{
		//return new Card(pRank, pSuit); 
		
		//4
		//use design by contract here
		return aCards.get(pSuit).get(pRank);
		
//		//3
//		if (!aCards.containsKey(pSuit))
//		{
//			aCards.put(pSuit, new HashMap<>());
//		}
//		Map<Rank, Card> inner = aCards.get(pSuit);
//		if ( !inner.containsKey(pRank))
//		{
//			inner.put(pRank, new Card(pRank,pSuit));
//		}
//		return inner.get(pRank);
	
		
		//1
//		for (Card card : aCards)
//		{
//			if (card.getRank() == pRank && card.getSuit() == pSuit)
//			{
//				return card;
//			}
//		}
//		Card card = new Card (pRank, pSuit);
//		aCards.add(card);
//		return card;
	}
	
	@Override
	public boolean equals(Object pObject)
	{
		//See if clauses are met
		if (pObject == null)
		{
			return false;
		}
		if (pObject == this)
		{
			return true;
		}
		if (pObject.getClass() != this.getClass())
		{
			return false;
		}
		//at this point pObject is of type Card
		Card other = (Card) pObject;
		return aRank == other.aRank && aSuit == other.aSuit;
		
	}
	
//	@Override
//	public int hashCode() 
//	{
//		return Rank.values().length * aSuit.ordinal() + aRank.ordinal();
//	}
	/**
	 * @return The rank of the card.
	 * @throws NoSuchElementException if this is a joker
	 */
	public Rank getRank()
	{
		return aRank.get();
	}
	
	/**
	 * @return The suit of the card.
	 * @throws NoSuchElementException if this is a joker
	 */
	public Suit getSuit()
	{
		return aSuit.get();
	}
	
	public static Card getJoker(Joker pJoker)
	{
		if (pJoker == Joker.BLACK)
		{
			return aBlackJoker;
		}
		else {
			return aWhiteJoker;
		}
	}

	public String toString() 
	{
		return aRank + " of " + aSuit;
	}
	


}


