package simplilearn;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//implicit conversion 
		
		System.out.println("Inplicit Casting");
		
		char a = 'A';		
		System.out.println("value of 'a' is " + a);
		
		int b = a; //char can be converted into int (range)		
		System.out.println("value of 'b' is " + b);
		
		float c = a; //char can be converted into float 
		System.out.println("value of 'c' is " + c);				
		
		long d = a; //char can be converted into float 
		System.out.println("value of 'd' is " + d);				
		
		double e = a; //char can be converted into float 
		System.out.println("value of 'e' is " + e);	
		
		System.out.println("+--------------------------------------+");
		System.out.println("Explicit Type Casting");
		
		double x = 45.5;
		System.out.println("value of 'x' is " + x);
		
		int y = (int) x;
		System.out.println("value of 'y' is " + y);
		
		char z = (char) x;
		System.out.println("value of 'z' is " + z);
		
		System.out.println("+--------------------------------------+");
		
		char abc = 'A';  // 16 bits ( 2bytes)  range --> positive 0 --- 65xxxx
		//short xyz = abc; // short --> 16 bit (2bytes) range ---> negative -32xxx to + 32xxx that's why conversion is not possible 
		
		
		
	}

}
