package chapter6;

public class Client 
{

	private static final Movie CARVE_UP = new Movie ("What a Carve Up!" , 1961, 87);
	private static final Movie GIANT_CLAW = new Movie ("The Giant Claw" , 1957, 75);
	private static final Movie ALLIGATOR = new Movie ("The Alligator People" , 1959, 74);
	
	private static final Comedy CHAVEZ = new Comedy("Martha Chaves", "Rebel Without a Pause", 82);
	
	public static void main(String[] args)
	{
		IntroducedShow monday = new IntroducedShow(CHAVEZ, "Ali Hassan", 5);
		CompositeShow tuesday = new CompositeShow(monday,CARVE_UP);
		IntroducedShow wednesday = new IntroducedShow(tuesday, "Martin", 10);
		
	}
	
	
}
