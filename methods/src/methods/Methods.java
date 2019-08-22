package methods;

public class Methods {
	
	// The static means that it belongs to the Methods class and not an object of the Methods class.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float var1 = 5.3f;
		int x = 10;
		int y = 10;
		int z;
		
		/** You can call the methods every time you want when you need to re-use code. **/
		// Only pass data to the function.
		function1(var1);
		
		// Pass data to the function and it returns data.
		z = function2(x, y);
		System.out.println("The result is: " + z);
		
		/* Method Overload. You can declare different functions with the same name.
		   but it has to have different inputs. */
		function3(var1);
		function3(x, y); 
		
		// Multiple arguments in a simplified way.
		function4(1, 5 , 6, 89);
	}
	
	// The void means that the method does not have a return value.
	public static void function1(float var1) {
		System.out.println("This is a method");
		System.out.println("You have " + var1 + " Euros" );
	}
	
	// You can use pretty much any datatype in a method.
	public static int function2(int x, int y) {
		int z = x * y; 
		return z;
	}
	
	// Methods for the method overload.
	public static void function3(float var1) {
		System.out.println("You have " + var1 + " Euros" );
	}
	
	public static void function3(int x, int y) {
		System.out.println("Result " + (x*y));
	}
	
	// You can pass multiple arguments using int... inside the parenthesis. You can also pass an array instead of separate arguments.
	public static void function4(int... numbers) {
		if(numbers.length == 0) {
			System.out.println("Pass informaton");
		}
		
		int total = 0;
		for(int n: numbers) {
			total = total + n;
		}
		
		System.out.println(total);
	}
}
