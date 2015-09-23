import java.util.Scanner;


public class UserInput
{
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
		
		

}