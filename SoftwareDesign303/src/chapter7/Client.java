package chapter7;

public class Client
{
	public static void main(String[] args)
	{
//		SponsoredComedy comedy = new SponsoredComedy();
		Comedy comedy1 = new SponsoredComedy("Martha Chaves", "Rebel Without a Pause", 82, "McGill", 5);
		SponsoredComedy comedy2 = new SponsoredComedy("Martha Chaves", "Rebel Without a Pause", 82, "McGill", 5);
		System.out.print(comedy2.time());
		Object object = "String";
		comedy2.setTitle(object);
	
	}
}
