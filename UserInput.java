import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class UserInput
{

	BikeStats bikeStats = new BikeStats();
	ArrayList<String[]> test = new ArrayList<String[]>();
	public UserInput () 
	{
		test = bikeStats.getArrayList();
	}
	

	public void typingThings()
	{
		Scanner in = new Scanner(System.in);
		bob: while(true)
			{
				System.out.println("Here are your options: \nBike (1, 2, 3)\nMountain (m)Bike (1, 2, 3)\nHybrid (h)Bike (1, 2, 3)\n*type in stop to terminate shopping*");

				String userInput = in.nextLine();

				String bikename = "bike 1";
				String bikename1 = "bike 2";
				String bikename2 = "bike 3";
				String mbikename = "mountain bike 1";
				String mbikename1 = "mountain bike 2";
				String mbikename2 = "mountain bike 3";
				String hbikename = "hybrid bike 1";
				String hbikename1 = "hybrid bike 2";
				String hbikename2 = "hybrid bike 3";


				if ((userInput.toLowerCase()).equals(bikename))
				{
					for(int i = 0; i < bikeStats.bike1Stats.length; i++)
					{
						System.out.println(bikeStats.bike1Stats[i]);
					}

				}
				else if ((userInput.toLowerCase()).equals("bike 2"))
				{
					for(int i = 0; i < bikeStats.bike2Stats.length; i++)
					{
						System.out.println(bikeStats.bike2Stats[i]);
					}
				} 
				else if ((userInput.toLowerCase()).equals("bike 3"))
				{	
					for(int i = 0; i < bikeStats.bike3Stats.length; i++)
					{
						System.out.println(bikeStats.bike3Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("mountain bike 1"))
				{	
					for(int i = 0; i < bikeStats.mBike1Stats.length; i++)
					{
						System.out.println(bikeStats.mBike1Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("mountain bike 2"))
				{	
					for(int i = 0; i < bikeStats.mBike3Stats.length; i++)
					{
						System.out.println(bikeStats.mBike2Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("mountain bike 3"))
				{	
					for(int i = 0; i < bikeStats.mBike3Stats.length; i++)
					{
						System.out.println(bikeStats.mBike3Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("hybrid bike 1"))
				{	
					for(int i = 0; i < bikeStats.hBike1Stats.length; i++)
					{
						System.out.println(bikeStats.hBike1Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("hybrid bike 2"))
				{	
					for(int i = 0; i < bikeStats.hBike3Stats.length; i++)
					{
						System.out.println(bikeStats.hBike2Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("hybrid bike 3"))
				{	
					for(int i = 0; i < bikeStats.hBike3Stats.length; i++)
					{
						System.out.println(bikeStats.hBike3Stats[i]);
					}
				}
				else if ((userInput.toLowerCase()).equals("stop"))
					{
						break bob;
					}
				else
				{
					System.out.println("Are you stupid? That's not a bike you prick!");
				}
			}
	}
}