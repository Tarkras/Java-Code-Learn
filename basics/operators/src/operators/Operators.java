package operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		int x = 5;
		int y = 3;
		
		// Arithmetic operators
		System.out.println("Add: " + (x + y));
		System.out.println("Multiply: " + (x * y));
		System.out.println("Division: " + (x / y));
		System.out.println("Module: " + (x % y)); // Module.
		int x2 = ++x; // Increment number by 1.
		int y2 = --y; // Decrease number by -1.
		System.out.println(x2);
		System.out.println(y2);
		
		// Relational operators.
		System.out.println(x == y); // Equal.
		System.out.println(x != y); // Different.
		System.out.println(x <= y); // Lower or equal. For only lower put < alone.
		System.out.println(x >= y); // Higher or equal. For only lower put < alone.
		
		//Bitwise operators: & (AND), | (OR), ^ (XOR), ~ (Bitwise Complement -> bits inverted),
		// >> (Signed Right shift operator -> The left operands value is moved right by the
		// number of bits specified by the right operand (there is a left shift).)
		// >>> (Shift right zero fill operator. The left operands value is moved right
		//by the number of bits specified by the right operand and shifted values are 
		// filled up with zeros (there is a left).).
		System.out.println("Bitwise operator: " + (x & y));
		
		// Logical Operators.
		boolean bool1 = true;
		boolean bool2 = true;
		
		System.out.println(bool1 && bool2); // Both must be true.
		System.out.println(bool1 || bool2); // One have to be true.
		
		// Assignment operators.
		int z= 4;
		z += 8; // Same as z = z + 8;
		System.out.println(z);
		
		// Conditional operator.
		int k = 65;
		int n = 65;
		int result = (k == n) ? 34 : 12; // If condition. If they are equal it returns 34 otherwise it returns 12.
		System.out.println("Conditional operator: "+ result);
	}

}
