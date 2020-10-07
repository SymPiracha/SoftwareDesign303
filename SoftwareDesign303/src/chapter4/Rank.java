package chapter4;



public enum Rank
{
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	
	public boolean isNumberCard()
	{
		return this.ordinal() < Rank.JACK.ordinal();
	}
}
