public class MountainBike extends ChangingAttributes
{
	int durability = 2;

	public MountainBike(int setspeed, int setgears, int setbrakes, int setdurability, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		durability = setdurability;
		color = setcolor;
	}
	
	public void Durability(int x)
	{
		durability = x;
	}

	public void mbStats()
	{
		System.out.println("Speed: " + speed + " \nGears: " + gears + " \nBrakes: " + brakes + " \nDurability: " + durability + " \nColor: " + color);
	}
}