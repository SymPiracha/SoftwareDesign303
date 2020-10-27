package chapter6;
/**
 * A show that is a screening of a movie
 *
 */
public class Movie implements Show 
{
	private String aTitle;
	private int aYear;
	private int aTime;
	
	public Movie (String pTitle, int pYear, int pTime)
	{
		aTitle = pTitle;
		aYear = pYear;
		aTime = pTime;
	}
	
	
	@Override
	public int time() 
	{
		return aTime;
	}

	@Override
	public String description() 
	{
		return String.format("[%s (%d) : %d mins]", aTitle, aYear, aTime);
	}


	@Override
	public Movie copy() {
		return new Movie(this.aTitle,this.aYear,this.aTime);
	}
	

}
