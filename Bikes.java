import java.util.ArrayList;

public class Bikes
{
	public static void main(String args[])
	{

		ArrayList<String[]> theBikes = new ArrayList<String[]>();

		String[] gBike1 = {"hi", "there", "peter"};
		String[] gBike2 = {"hi", "there", "alex"};
		String[] gBike3 = {"mateo", "go", "away"};
		String[]  = {"guy", "on", "phone"};
		theBikes.add();
		theBikes.add();
		theBikes.add();
		theBikes.add();


		

		GenericBike gBike1 = new GenericBike();
		gBike1.bikeStats();

		GenericBike gBike2 = new GenericBike("3","4","7","Navy Blue");
		gBike2.bikeStats();

		GenericBike gBike3 = new GenericBike("5","6","5","Camo Green");
		gBike3.bikeStats();

		MountainBike mountainBike1 = new MountainBike("6","6","6","7","Neon Pink");
		mountainBike1.mbStats();

		MountainBike mountainBike2 = new MountainBike("5","7","7","5","Barney Purple");
		mountainBike2.mbStats();

		MountainBike mountainBike3 = new MountainBike("7","5","6","6","Racist Black");
		mountainBike3.mbStats();

		HybridBike hybridBike = new HybridBike("6","4","7","7","8","Space Grey");
		hybridBike.hbStats();

		HybridBike hybridBike2 = new HybridBike("7","7","5","8","6","Asian Yellow");
		hybridBike2.hbStats();

		HybridBike hybridBike3 = new HybridBike("7","6","6","6","7","Puke Orange");
		hybridBike3.hbStats();

		
	}
}