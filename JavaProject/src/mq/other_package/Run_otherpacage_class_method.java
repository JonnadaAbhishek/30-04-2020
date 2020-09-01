package mq.other_package;

import mq.instance_methods.RobotA;
import mq.static_methods.RobotB;


public class Run_otherpacage_class_method {

	public static void main(String[] args) 
	{
		//calling instance method
		RobotA obj= new RobotA();
		obj.walk();
		obj.run();
		
		//calling static method
		
		RobotB.sleep();
		RobotB.Wokeup();
		
	}

}
