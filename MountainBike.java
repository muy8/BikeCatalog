public class MountainBike extends GenericBike
{
	String durability = 2;

	public MountainBike(String setspeed, String setgears, String setbrakes, String setdurability, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		durability = setdurability;
		color = setcolor;
	}
	
	public void Durability(String x)
	{
		durability = x;
	}

	public void mbStats()
	{
		System.out.println("Speed: " + speed + " \nGears: " + gears + " \nBrakes: " + brakes + " \nDurability: " + durability + " \nColor: " + color);
	}
}