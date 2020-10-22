package chapter6;

import java.util.EnumMap;

public class Program 
{
	
	private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);
	
	public Program()
	{
		clear();
	}
	
	
	/**
	 * Removes all the shows from the program.
	 */
	public void clear()
	{
		for (Day day : Day.values() )
		{
			aShows.put(day, Show.NULL);
		}
	}
	/**
	 * @param pDay
	 * @param pShow
	 */
	public void add(Day pDay, Show pShow)
	{
		assert pDay != null;
		aShows.put(pDay, pShow);
	}
	/**
	 * @param pDay
	 */
	public void remove (Day pDay)
	{
		aShows.remove(pDay);
	}
	
	public Show get(Day pDay)
	{
		return aShows.get(pDay);
	}
	
	public String toString()
	{
		StringBuilder description = new StringBuilder();
		for (Day day : Day.values() )
		{
			description.append(day).append(": ").append(aShows.get(day).description()).append("\n");
		}
		return description.toString();
	}
	
}
