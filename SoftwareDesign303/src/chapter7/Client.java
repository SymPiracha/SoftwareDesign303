package chapter7;

public class Client
{
	public static void main(String[] args)
	{
		SponsoredComedy comedy2 = new SponsoredComedy("Martha Chaves", "Rebel Without a Pause", 82, "McGill", 5);
		System.out.println(comedy2.description());
		
		IntroducedShow is = new IntroducedShow(comedy2, "Sym",5);
		System.out.println(is.description());

	}
}
