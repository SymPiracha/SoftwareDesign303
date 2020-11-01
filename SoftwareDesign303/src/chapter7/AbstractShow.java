package chapter7;

public abstract class AbstractShow implements Show 
{
	private final String aTitle;
	private final int aTime;
	
	protected AbstractShow (String pTitle, int pTime)
	{
		aTitle = pTitle;
		aTime = pTime;
	}
	
	protected String title()
	{
		return aTitle;
	}
	
	public int time()
	{
		return aTime;
	}
}
