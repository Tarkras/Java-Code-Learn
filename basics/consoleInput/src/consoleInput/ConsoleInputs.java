package consoleInput;

import java.io.BufferedReader; // Allows get content from the buffer.
import java.io.IOException;
import java.io.InputStreamReader; // Allows to get inputs, store them in the buffer.

public class ConsoleInputs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		// Create a buffer reader object. Inside takes the input of the user.
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
		
		String name = reader.readLine();
		
		System.out.println(name);
	}

}

