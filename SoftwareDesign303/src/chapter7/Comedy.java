package chapter7;

import chapter6.Day;

public class Comedy extends AbstractShow 
{
	private String aComedian;

	
	public Comedy(String pComedian, String pTitle, int pTime )
	{
		super(pTitle, pTime);
		aComedian = pComedian;
		
	}

	protected String Comedy()
	{
		return aComedian;
	}
	
	@Override
	public String description() 
	{
		return String.format("[%s : %s (%d mins)]", aComedian, title(), time());
	}

}

