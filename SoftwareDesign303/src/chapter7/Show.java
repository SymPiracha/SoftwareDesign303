package chapter7;


/**
 * A performance that can take place
 */
public interface Show
{
	private static Show createNull()
	{
		return new Show()
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

			@Override
			public Show copy() {
				return createNull();
			}
		
		};
	}
	
	static Show NULL = createNull();
	
	/**
	 * @return total running time for show
	 */
	int time();
	/**
	 * @return description of show to appear in program
	 */
	String description();
	
	default boolean isNull() {return false;};
	
	/**
	 * Returns a different but equal object
	 * @return
	 */
	Show copy();
}
