public class HybridBike extends GenericBike
{
	String offRoadDurability = "2";
	String onRoadDurability = "3";

	public HybridBike(String setspeed, String setgears, String setbrakes,String setonroaddurability, String  setoffroaddurability, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		offRoadDurability = setoffroaddurability;
		onRoadDurability = setonroaddurability;
		color = setcolor;
	}

	public void changeOffRoadDurability(String x)
	{
		offRoadDurability = x;
	}
	public void changeOnRoadDurability(String x)
	{
		onRoadDurability = x;
	}
	public void hbStats()
	{
		System.out.println("Speed: " + speed + " \nGears: " + gears + " \nBrakes: " + brakes + " \nOff Road Durability: " + offRoadDurability + "\nOn Road Durability: " + onRoadDurability + " \nColor: " + color);
	}
}