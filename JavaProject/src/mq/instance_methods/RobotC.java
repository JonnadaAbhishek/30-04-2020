package mq.instance_methods;

public class RobotC 
{
	
	public void walk(int km) // Functional parameter
	{
		System.out.println(km);
	}

	public int getspeed()
	{
		return 5;
	}
	
	public double getprice(int num)
	{
		return 2500.0 * num; //It return value to method name
	}
	public double getprice1(int num)
	{
		return 5000.0* num;
	}
	
	public static void main(String[] args) 
	{
		
		//create a object for class
		RobotC obj=new RobotC();
		obj.walk(5);// 5 is a actual parameter/[argument]
		obj.walk(6);// 6 is a actual parameter/[argument]
		
		int speed=obj.getspeed();
		System.out.println("return speed is =>"+speed);
		
		double total=obj.getprice(2);
		System.out.println("total price of robot is =>"+total);

		double total1=obj.getprice1(6);
		System.out.println("total price of robot is =>"+total1); 
	}

}
