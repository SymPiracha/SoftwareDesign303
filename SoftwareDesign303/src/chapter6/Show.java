package chapter6;

/**
 * A performance that can take place
 */
public interface Show
{
	static Show NULL = new Show()
			{
				@Override
				public int time()
				{
					return 0;
				}

				@Override
				public String description() 
				{
					return "No show";
				}
				
				@Override
				public boolean isNull() { return true; }
			
			};
	
	
	/**
	 * @return total running time for show
	 */
	int time();
	/**
	 * @return description of show to appear in program
	 */
	String description();
	
	default boolean isNull() {return false;};
}
