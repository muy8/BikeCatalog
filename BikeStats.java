import java.util.ArrayList;

public class BikeStats
{
	ArrayList<String[]> test;
	String[] bike1Stats;
	String[] bike2Stats;
	String[] bike3Stats;
	String[] mBike1Stats;
	String[] mBike2Stats;
	String[] mBike3Stats;
	String[] hBike1Stats;
	String[] hBike2Stats;
	String[] hBike3Stats;
	public BikeStats()
	{
		test = new ArrayList<String[]>();
		bike1Stats = new String[5];
		bike2Stats = new String[5];
		bike3Stats = new String[5];
		mBike1Stats = new String[6];
		mBike2Stats = new String[6];
		mBike3Stats = new String[6];
		hBike1Stats = new String[7];
		hBike2Stats = new String[7];
		hBike3Stats = new String[7];
		
		test.add((bike1Stats));
		test.add((bike2Stats));
		test.add((bike3Stats));
		test.add((mBike1Stats));
		test.add((mBike2Stats));
		test.add((mBike3Stats));
		test.add((hBike1Stats));
		test.add((hBike2Stats));
		test.add((hBike3Stats));

		bike1Stats[0] = "Generic Bike 1";
		bike1Stats[1] = "Speed: 4";
		bike1Stats[2] = "Brakes: 5";
		bike1Stats[3] = "Gears: 6";
		bike1Stats[4] = "Colour: Period Red";

		bike2Stats[0] = "Generic Bike 2";
		bike2Stats[1] = "Speed: 3";
		bike2Stats[2] = "Brakes: 4";
		bike2Stats[3] = "Gears: 7";
		bike2Stats[4] = "Colour: Toilet Water Blue";

		bike3Stats[0] = "Generic Bike 3";
		bike3Stats[1] = "Speed: 5";
		bike3Stats[2] = "Brakes: 6";
		bike3Stats[3] = "Gears: 5";
		bike3Stats[4] = "Colour: Marijuana Green";

		mBike1Stats[0] = "Mountain Bike 1";
		mBike1Stats[1] = "Speed: 6";
		mBike1Stats[2] = "Brakes: 6";
		mBike1Stats[3] = "Gears: 6";
		mBike1Stats[4] = "Durability: 7";
		mBike1Stats[5] = "Colour: Acne Pink";

		mBike2Stats[0] = "Mountain Bike 2";
		mBike2Stats[1] = "Speed: 5";
		mBike2Stats[2] = "Brakes: 7";
		mBike2Stats[3] = "Gears: 7";
		mBike2Stats[4] = "Durability: 5";
		mBike2Stats[5] = "Colour: Ron Burgundy";

		mBike3Stats[0] = "Mountain Bike 3";
		mBike3Stats[1] = "Speed: 7";
		mBike3Stats[2] = "Brakes: 5";
		mBike3Stats[3] = "Gears: 6";
		mBike3Stats[4] = "Durability: 6";
		mBike3Stats[5] = "Colour: Racist Black";

		hBike1Stats[0] = "Hybrid Bike 1";
		hBike1Stats[1] = "Speed: 6";
		hBike1Stats[2] = "Brakes: 4";
		hBike1Stats[3] = "Gears: 7";
		hBike1Stats[4] = "Durability Off Road: 7";
		hBike1Stats[5] = "Durability On Road: 8";
		hBike1Stats[6] = "Colour: 50 Shades of Grey";

		hBike2Stats[0] = "Hybrid Bike 2";
		hBike2Stats[1] = "Speed: 7";
		hBike2Stats[2] = "Brakes: 7";
		hBike2Stats[3] = "Gears: 5";
		hBike2Stats[4] = "Durability Off Road: 8";
		hBike2Stats[5] = "Durability On Road: 6";
		hBike2Stats[6] = "Colour: Asian Yellow";

		hBike3Stats[0] = "Hybrid Bike 3";	
		hBike3Stats[1] = "Speed: 7";
		hBike3Stats[2] = "Brakes: 6";
		hBike3Stats[3] = "Gears: 6";
		hBike3Stats[4] = "Durability Off Road: 6";
		hBike3Stats[5] = "Durability On Road: 7";
		hBike3Stats[6] = "Colour: Puke Orange";
	}

	public ArrayList<String[]> getArrayList()
	{
		return test;
	}
}