package mq.static_methods;

public class RobotB
{
	
	public RobotB()
	{
			System.out.println("Robot B went to bed");
		
	}
	public static void sleep()
	{
		System.out.println("Robot went to sleep");
	}
	//static specifier method
	public static void Wokeup()
	{
		System.out.println("Robot is awake");
	}

	public static void main(String[] args) 
	{
		
		RobotB.sleep();
        RobotB.Wokeup();
        
        RobotB.sleep();
		RobotB.Wokeup();
	}
	
}




		




