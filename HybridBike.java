public class HybridBike extends ChangingAttributes
{
	int offRoadDurability = 2;
	int onRoadDurability = 3;

	public HybridBike(int setspeed, int setgears, int setbrakes,int setonroaddurability, int  setoffroaddurability, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		offRoadDurability = setoffroaddurability;
		onRoadDurability = setonroaddurability;
		color = setcolor;
	}

	public void changeOffRoadDurability(int x)
	{
		offRoadDurability = x;
	}
	public void changeOnRoadDurability(int x)
	{
		onRoadDurability = x;
	}
	public void hbStats()
	{
		System.out.println("Speed: " + speed + " \nGears: " + gears + " \nBrakes: " + brakes + " \nOff Road Durability: " + offRoadDurability + "\nOn Road Durability: " + onRoadDurability + " \nColor: " + color);
	}
}