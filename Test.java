

public class Test {
	
	public static void main(String[] args)
	{
		CarType a = new CarType();
		MotorcycleType c = new MotorcycleType();
		BicycleType d = new BicycleType();
		
		a.setName("Peugeot");
		a.setDoors(4);
		a.setWheels(4);
		a.setMaxSpeed(240);
		
		c.setName("Kawasaki");
		c.setDoors(0);
		c.setSpeed(267);
		c.setWheels(2);
		
		d.setName("Bicycle");
		d.setDoors(0);
		d.setWheels(2);
		d.setSpeed(48);
		
		
		
		V4W fourWheels[] = new V4W[2];
		fourWheels[0] = a;
		
		V2W twoWheels[] = new V2W[2];
		twoWheels[0] = c;
		twoWheels[1] = d;
		
		
		for(V2W j:twoWheels)
			j.printInfo();
		
	
		
		a.printInfo();
		c.printInfo();
		d.printInfo();
	}

}
