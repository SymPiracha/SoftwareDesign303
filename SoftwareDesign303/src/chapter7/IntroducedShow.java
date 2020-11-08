package chapter7;

public class IntroducedShow extends DecoratedShow 
{
	private final String aSpeaker;
	private final int aTime;
	
	public IntroducedShow(Show pShow, String pSpeaker, int pTime)
	{
		super(pShow);
		aSpeaker = pSpeaker;
		aTime = pTime;
	}
	@Override
	public int time()
	{
		return super.time() + aTime; 
	}
	
	@Override
	public String description()
	{
		return super.description() + " introduced by " + aSpeaker;
	}
	
}
