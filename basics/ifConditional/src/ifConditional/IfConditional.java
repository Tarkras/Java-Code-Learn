package ifConditional;
import java.io.BufferedReader; // Allows get content from the buffer.
import java.io.IOException;
import java.io.InputStreamReader; // Allows to get inputs, store them in the buffer.

public class IfConditional {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
		
		System.out.println("Enter a number between 1 and 3.");
		String result = reader.readLine();
		int i = Integer.parseInt(result); // String to integer.
		
		// If Condition, enters inside if the requirements are met.
		// Can use logical operators and relational operators to make complex conditions.
		if(i == 1)
		{
			System.out.println("You enter the condition, your value is 1");
		} else if(i == 2) {
			System.out.println("You enter the condition, your value is 2");
		} else {
			System.out.println("You enter the condition, your value is neither 1 nor 2");
		}

	}

}
