package switchStatement;

import java.io.BufferedReader; // Allows get content from the buffer.
import java.io.IOException;
import java.io.InputStreamReader; // Allows to get inputs, store them in the buffer.

public class SwitchStatement {

	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
		
		System.out.println("Enter a number between 0 and 3.");
		String result = reader.readLine();
		int i = Integer.parseInt(result); // String to integer.
		
		// Depending on the input command it uses one case or another.
		switch(i)
		{
			case 0:
				System.out.println("Number 0");
				break; //The break allows to stop the switch. If not it runs the next one.
				
			case 1:
				System.out.println("Number 1");
				break;
				
			case 2:
				System.out.println("Number 2");
				break;
				
			case 3:
				System.out.println("Number 3");
				break;
				
			default: // It will run this code if the input is not valid.
				System.out.println("Not valid");
		}
	}

}
