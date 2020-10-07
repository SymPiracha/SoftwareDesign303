package chapter4;

public enum Suit 
{ 
	CLUBS, DIAMONDS, SPADES, HEARTS;
	
	public boolean isBlack()
	{
		return this == CLUBS || this == SPADES;
	}
	
	
}
