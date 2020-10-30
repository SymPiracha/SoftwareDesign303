package chapter7;

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
	
	public Comedy()
	{
		aComedian = "No one";
		aTime = 0;
		aTitle = "Not funny";
	}
	
	//Copy constructor
	public Comedy (Comedy pComedy)
	{
		aComedian = pComedy.aComedian;
		aTime = pComedy.aTime;
		aTitle = pComedy.aTitle;
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

	@Override
	public Show copy() {
		return new Comedy(this);
	}

}

