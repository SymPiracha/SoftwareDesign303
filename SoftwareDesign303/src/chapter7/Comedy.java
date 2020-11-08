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

	protected String comedian()
	{
		return aComedian;
	}
	

	@Override
	protected String extraInformation() 
	{
		return String.format("by %s", aComedian);
	}

}

