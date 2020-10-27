package chapter6;

import java.util.EnumMap;

public class Program 
{
	
	private final EnumMap<Day, Show> aShows = new EnumMap<>(Day.class);
	private Show aDefault = Show.NULL;
	
	public Program()
	{
		clear();
	}
	
	public void setDefault(Show pShow)
	{
		aDefault = pShow;
	}
	
	public void initialize()
	{
		initialize(Day.values());
	}
	
	public void initialize(Day ... pDays)
	{
		for (Day day: pDays )
		{
			aShows.put(day, aDefault.copy());
		}
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
