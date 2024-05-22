
public class CarType extends Car implements V4W
{
	
	private int wheels;
	private int doors;
	private int maxSpeed;
	
	public void setWheels(int n)
	{
		wheels = n;
	}
	
	public int getWheels()
	{
		return wheels;
	}
	
	public void setDoors(int n)
	{
		doors = n;
	}
	
	public int getDoors()
	{
		return doors;
	}
	
	public void setMaxSpeed(int n)
	{
		maxSpeed = n;
	}
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void printInfo()
	{
		this.printName();
		
		System.out.printf("\tThis car has: %d wheels\n\t, %d doors \n\t and maximum speed is : %d miles/hour\n\n", this.getWheels(), getDoors(), getMaxSpeed());
	}

}
