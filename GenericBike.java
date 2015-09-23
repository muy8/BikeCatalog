public class GenericBike
{

	String speed = 4;
	String brakes = 5;
	String gears = 6;
	String color = "Crimson Red";

	public GenericBike() {}
	public GenericBike(String setspeed, String setgears, String setbrakes, String setcolor)
	{
		speed = setspeed;
		brakes = setbrakes;
		gears = setgears;
		color = setcolor;
	}
	public void changeSpeed(String x)
	{
		speed = x;
	}

	public void changeGears(String x)
	{
		gears = x;
	}
	public void changeBrakes(String x)
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