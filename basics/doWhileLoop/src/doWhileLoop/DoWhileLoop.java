package doWhileLoop;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Same as the while loop but it does one iteration at first when
		// you have for example k < 0 because the condition is still true
		// and then it evaluates the expression. (First it executes the code
		// then it evaluates the expression).
		int k = 0;
		
		do
		{
			System.out.println("Number: " + k);
			k++;
		} while(k < 100);
		
		// BREAK: In the loops the break statement allows you to stop the code if a certain
		// condition is met.
		
		// CONTINUE: In the loops the continue statement allows you to continue the code but
		// you skip the iteration when a certain condition is met. It usually goes
		// at the start of the loop.
	}

}
