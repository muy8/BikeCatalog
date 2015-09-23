import java.util.Scanner;

public class Bikes
{
	public static void main(String args[])
	{

		ChangingAttributes gBike1 = new ChangingAttributes();
		gBike1.bikeStats();

		ChangingAttributes gBike2 = new ChangingAttributes(3,4,7,"Navy Blue");
		gBike2.bikeStats();

		ChangingAttributes gBike3 = new ChangingAttributes(5,6,5,"Camo Green");
		gBike3.bikeStats();

		MountainBike mountainBike1 = new MountainBike(6,6,6,7,"Neon Pink");
		mountainBike1.mbStats();

		MountainBike mountainBike2 = new MountainBike(5,7,7,5,"Barney Purple");
		mountainBike2.mbStats();

		MountainBike mountainBike3 = new MountainBike(7,5,6,6,"Racist Black");
		mountainBike3.mbStats();

		HybridBike hybridBike = new HybridBike(6,4,7,7,8,"Space Grey");
		hybridBike.hbStats();

		HybridBike hybridBike2 = new HybridBike(7,7,5,8,6,"Asian Yellow");
		hybridBike2.hbStats();

		HybridBike hybridBike3 = new HybridBike(7,6,6,6,7,"Puke Orange");
		hybridBike3.hbStats();

		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();

		userInput = userInput.toLowerCase();
		
		String bikename = "bike1";
		String bikename1 = "bike2";
		String bikename2 = "bike3";
		Object b1 = bikename;
		Object b2 = bikename1;
		Object b3 = bikename2;

		userInput.bikeStats();

/*
		if (userInput.equals(bikename))
		{
			gBike1.bikeStats();
		} 
		else if (userInput.equals(bikename1))
		{
			gBike2.bikeStats();
		} 
		else if (userInput.equals(bikename2))
		{
			gBike3.bikeStats();
		}
		*/
		
	}
}