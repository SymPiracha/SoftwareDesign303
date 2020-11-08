package chapter7;

public abstract class DecoratedShow implements Show 
{
	private final Show aShow;

	protected DecoratedShow(Show pShow)
	{
		aShow = pShow;
	}

	
	public int time()
	{
		return aShow.time();
	}

	@Override
	public String description() 
	{
		return aShow.description();
	}

}
