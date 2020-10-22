package chapter6;

import java.util.List;
import java.util.Arrays;

public class CompositeShow implements Show
{
	private final List<Show> aShows;
	
	public CompositeShow(Show... pShows)
	{
		aShows = Arrays.asList(pShows);
	}

	@Override
	public int time() 
	{
		int time = 0;
		for (Show show : aShows)
		{
			time += show.time();
		}
		return time;
	}

	@Override
	public String description() 
	{
		StringBuilder description = new StringBuilder("[");
		for (Show show : aShows)
		{
			description.append(show.description()).append(";");
		}
		return description.append("]").toString();
	}
	
}
