package simplilearn;

public class TypeConversion {

	public static void main(String[] args) {
		
		//pass command line argument: eg. 40 
		System.out.println("args [0] is: " + args[0]);
		
		String xpto = args[0];
		System.out.println("the value is " + xpto );
		//int x = value;  // String can't be converted to int automatically, is an object 
	
		//user wrapper classe (8)
		// int 		--> Integer
		// boolean 	--> Boolean
		// short 	--> Short
		
		int x = Integer.parseInt(xpto);
		System.out.println("the value of x: " + x);
	}
	

}
