public class ChangingAttributes
{

	int speed = 4;
	int brakes = 5;
	int gears = 6;
	String color = "Crimson Red";

	public ChangingAttributes() {}
	public ChangingAttributes(int setspeed, int setgears, int setbrakes, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		color = setcolor;
	}
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
	public void changeColor(String x)
	{
		color = x;
	}
	public void bikeStats()
	{
		System.out.println("Speed: " + speed + " \nGears: " + gears + " \nBrakes: " + brakes + "\nColor: " + color);
	}
	
		
}