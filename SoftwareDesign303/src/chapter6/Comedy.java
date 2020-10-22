package chapter6;

public class Comedy implements Show 
{
	private String aComedian;
	private int aTime;
	private String aTitle;
	
	public Comedy(String pComedian, String pTitle, int pTime )
	{
		aComedian = pComedian;
		aTime = pTime;
		aTitle = pTitle;
	}
	@Override
	public int time() 
	{
		return aTime;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

}
