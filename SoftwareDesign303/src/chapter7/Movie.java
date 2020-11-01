package chapter7;

/**
 * A show that is a screening of a movie
 *
 */
public class Movie extends AbstractShow 
{

	private int aYear;
	
	public Movie (String pTitle, int pYear, int pTime)
	{
		super (pTitle, pTime);
		aYear = pYear;
	}
	
	
	@Override
	public String description() 
	{
		return String.format("[%s (%d) : %d mins]", title(), aYear, time());
	}

}

