
public class BicycleType extends Bicycle implements V2W {
	
	private int doors;
	private int speed;
	private int wheels;
	
	public void setWheels(int nr)
	{
		wheels = nr;
	}
	
	public int getWheels()
	{
		return wheels;
	}
	
	public void setDoors(int nr)
	{
		doors = nr;
	}
	
	public int getDoors()
	{
		return doors;
	}
	
	public void setSpeed(int nr)
	{
		speed = nr;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getNrSeats()
	{
		return 1;
	}
	
	public void printInfo()
	{
		this.printName();
	
		System.out.printf("\tThis bicycle has: %d wheels \n\t , %d doors\n\t and the maximum speed is: %d miles/hour\n", this.getWheels(), getDoors(), getSpeed());
		System.out.printf("\tThe number of seats is: %d\n\n", this.getNrSeats());
	}



}