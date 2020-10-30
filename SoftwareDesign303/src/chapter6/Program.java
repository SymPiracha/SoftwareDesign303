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
	private void clear()
	{
		for (Day day : Day.values() )
		{
			aShows.put(day, Show.NULL);
		}
	}
	
	public Command createClearCommand()
	{
		return new Command()
				{
					@Override
					public void execute() 
					{
						clear();
					}
					@Override
					public String toString()
					{
						return String.format("Clear shows");
								
					}
			
				};
	}
	/**
	 * @param pDay
	 * @param pShow
	 */
	private void add(Day pDay, Show pShow)
	{
		assert pDay != null;
		aShows.put(pDay, pShow);
	}
	
	
	public Command createAddCommand(Day pDay, Show pShow)
	{
		return new Command()
				{
					@Override
					public void execute() 
					{
						add(pDay, pShow);
					}
					@Override
					public String toString()
					{
						return String.format("Add (%s): $s", pDay,pShow.description());
								
					}
			
				};
	}
	
	
	
	/**
	 * @param pDay
	 */
	private void remove (Day pDay)
	{
		aShows.remove(pDay);
	}
	
	public Command createRemoveCommand(Day pDay)
	{
		return new Command()
				{
					@Override
					public void execute() 
					{
						remove(pDay);
					}
					@Override
					public String toString()
					{
						return String.format("Remove (%s)", pDay);
								
					}
			
				};
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
