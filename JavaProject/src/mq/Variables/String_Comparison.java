package mq.Variables;

public class String_Comparison {

	public static void main(String[] args)
	{
	
		/*
		 * Equals
		 *      => Method compares any two string matching and return a boolean value
		 *      =>true,false/ Equal comparision is case sensitive.
		 *    
		 */
		String Expected_res="Account Created";
		String Actual_res="account created";
		
		boolean flag=Actual_res.equals(Expected_res);
		System.out.println("The Account is Created => "+flag);
		
		
		
		boolean flag1=Expected_res.equals(Actual_res);
		System.out.println("The Account is not at all created=> "+flag1);
		
		/*
		 * Compare two string with double equals  Actual==Expected
		 */
		
		if(Expected_res==Actual_res)
			System.out.println("Comparision equal");
		else
			System.out.println("Comparision is not equal");
		
		/*
		 * Equal ignore case 
		 * Method verify equal comparsion between  two strings, by Ignoring case sensitive.
		 */
	
		boolean ind=Actual_res.equalsIgnoreCase(Expected_res);
			System.out.println("Equal ignore case comparision=>"   +ind);
			
		boolean ind1=Expected_res.equalsIgnoreCase(Actual_res);
		  System.out.println("Equal ignore case comaprison=>"      +ind1);
		  
		  
		 /* Contains:
		  * Method verify subsequient characters available at string, and return  boolean value
		  * True or False.
		  */
		
		String Status="Account 100 created succesfully";
		boolean flag3=Status.contains("succesfully");
		System.out.println("Sub String available status is=>"   + flag3);
		  
		  
		  /*
		   * Sub string:
		   * Method retrive sub string characters from main string
		   */
		
		String Account_Number="1000012345698745";
		 
		//Get last digit numbers:
		String Last_digits=Account_Number.substring(5);
		System.out.println("the last digit account number is=>"  +Last_digits);
		
		//Get Middle Digit Number:
		String Middle_Digits=Account_Number.substring(6, 10);
		System.out.println("The Middle Digit Account Number is=>"  +Middle_Digits);
		
		/*
		 * Length:
		 *Method return Number of Characters count with integer format.
		 */
		
		String Mobile_Num="7799137575";
		int len=Mobile_Num.length();
		System.out.println("The moblie Number Length is=>"   +len);
		
		if(len==10)
			System.out.println("the mobile is available in 10 digits");
		else
			System.out.println("The mobile is not available in 10 digits");
		
		
		String Gas_num="15556662220002233300";
		int len1=Gas_num.length();
		System.out.println("The gas number length is=>"   +len1);
		
		if(len1==15)
			System.out.println("the gas is available in 15 digits");
		else
			System.out.println("The gas is not available in 10 digits");
		
		/*
		 * empty;
		 * the method verify empty status of string and return boolean value as true or false.
		 */
		  
		
		String var1="MQ";
		String var2="";
		
		System.out.println("Empty status of var1   =>  "+var1.isEmpty());
		System.out.println("Empty status of var2   =>  "+var2.isEmpty());
		
		/*
		 *Lower case 
		 */
		  
		
		String Result="Account is succesfully created";
		String New_result=Result.toLowerCase();
		System.out.println(" Charcters in The lower case=> " +New_result);
		
		
		String ufccode="asdf25365";
		String new_result=ufccode.toUpperCase();
		System.out.println("The characters in the upper case=>"  +new_result);
		
		
		/*
		 * Char At: Method return single charcter using index position.
		 */
		
		
		String toolname="WebDriver";
		 char ch=toolname.charAt(3);
		 System.out.println("SIngle character is => "+ch);
		 
		String toolname1="lkjhdjhafhBBSGDUG";
		char ch2=toolname1.charAt(6);
		System.out.println("the single charcter is=>"+ch2);
		
		/*
		 * The char Start With:
		 * Method verify given string starts with expected charcters and return boolean values.
		 */
		
		String IFSC_CODE="hdfcacct123456789987";
		boolean flaag=IFSC_CODE.startsWith("hdfc");
		System.out.println("ifcs code starts with the status=>"+flaag);
		
		/*The charcter Ends with:
		 * Method is to verify the given string ends with expected characters and return the boolean values.
		 * 
		 */
		
		
		String Place="HYDERABAD, (HYD)";
		boolean flag9=Place.endsWith("(HYD)");
		System.out.println("the place name ends with=>"+flag9);
		
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
	}

}
