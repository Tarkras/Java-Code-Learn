package vectors;

import java.util.*;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// See https://www.tutorialspoint.com/java/java_vector_class.htm and https://www.geeksforgeeks.org/java-util-vector-class-java/
		Vector vec = new Vector();
		
		vec.addElement(1); // Adds an element in order.
		vec.addElement(4);
		vec.addElement(78);
		
		System.out.println(vec);
		System.out.println(vec.get(1));
		
		Enumeration e = vec.elements(); // Returns an enumeration of the components of this vector.
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
