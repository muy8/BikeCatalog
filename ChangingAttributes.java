public class ChangingAttributes
{

		int speed = 4;
		int brakes = 5;
		int gears = 6;
		int offRoadDurability = 2;
		int onRoadDurability = 3;
		String color = "red";

	public void changeSpeed(int x)
	{
		speed = x;
	}

	public void changeGears(int x)
	{
		gears = x;
	}
	public void changeBrakes(int x)
	{
		brakes = x;
	}
	public void changeOffRoadDurability(int x)
	{
		offRoadDurability = x;
	}
	public void changeOnRoadDurability(int x)
	{
		onRoadDurability = x;
	}
	public void changeColor(String x)
	{
		color = x;
		System.out.println(x);
	}

	public static void getSpeed()
	{
		System.out.println("Speed" + speed + " Gears" + gears);
	}
	
}