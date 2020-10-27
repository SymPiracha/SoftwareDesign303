package chapter6;
/** 
 * Decorator Design Pattern
 */
public class IntroducedShow implements Show
{

	private final Show aShow; //Show being wrapped
	private final String aSpeaker;
	private final int aTime;
	
	public IntroducedShow(Show pShow, String pSpeaker, int pTime)
	{
		aShow = pShow;
		aSpeaker = pSpeaker;
		aTime = pTime;
	}
	
	
	@Override
	public int time() 
	{
		return aShow.time() + aTime;
	}

	@Override
	public String description() 
	{
		return aShow.description() + " introduced by " + aSpeaker;
	}


	@Override
	public Show copy() 
	{
		Show copyShow = aShow.copy();
		return new IntroducedShow(copyShow, aSpeaker, aTime);
	}

}
