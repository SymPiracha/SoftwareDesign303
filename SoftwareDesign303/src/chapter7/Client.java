package chapter7;

public class Client
{
	public static void main(String[] args)
	{
//		SponsoredComedy comedy = new SponsoredComedy();
		SponsoredComedy comedy2 = new SponsoredComedy("Martha Chaves", "Rebel Without a Pause", 82, "McGill", 5);
		System.out.print(comedy2.time());
	
	}
}
