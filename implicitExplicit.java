package Madhavarr;

public class implicitExplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Typecasting: It is a data type is converted into another
		//             data type by the programmer using the casting operator 
		//             during the program design.
		System.out.println("Implicit Type Casting");
		
		char a ='A';
		System.out.println("Value of a: " +a);
		int b = a;
		System.out.println("Value of a: "+b);
		float c = a;
		System.out.println("Value of a: "+c);
		long d = a;
		System.out.println("Value of a: "+d);
		double e = a;
		System.out.println("Value of a: "+e);
		System.out.println("\nExplicit Type Casting");
		double x = 45.5;
		int y = (int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		
	}

}
