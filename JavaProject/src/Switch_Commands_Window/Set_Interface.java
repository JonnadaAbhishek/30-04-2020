package Switch_Commands_Window;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) 
	{
	Set<String> set=new HashSet<String>();
	set.add("one");
	set.add("second");
	set.add("three");
	set.add("four");
	set.add("three");
	set.add("second");
	
	for(String  Eachobj : set)
	{
		if(Eachobj.equals("four"))
		System.out.println("Found required object");
		break;
		
		
			
	}
	for(String Eachobj :set)
	{
		System.out.println("=>" +Eachobj);
	}
	
	
	
	}
	
	}

