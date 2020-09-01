package mq.instance_methods;

public class RobotA
{
//Constructor of a class [or] class instance
	public RobotA() 
	{
	System.out.println("turn on Robot A");	
	}
//instance method
	public void walk()
	{
		System.out.println("walk executed");
	}
	//Instance method
	public void run()
	{
		System.out.println("run executed");
	}
	//main method
	public static void main(String[] args) 
	{
		RobotA obj= new RobotA();
		obj.walk();
		obj.run();
	}

}
