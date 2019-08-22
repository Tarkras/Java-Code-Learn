package sets;

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Set is an unordered collection of objects in which duplicate values
		 *  cannot be stored. Is implemented by HashSet, LinkedHashSet or TreeSet 
		 *  (sorted representation).*/
		
		/*  See https://www.geeksforgeeks.org/set-in-java/ 
		 *  http://tutorials.jenkov.com/java-collections/set.html
		 * */
		
		Set<Integer> numbers = new HashSet<Integer> ();
		
		numbers.add(6);
		numbers.add(27);
		numbers.add(86);
		numbers.add(-4);
		numbers.add(654);
		numbers.add(6); // Even if I have two numbers six, one is not stored.
		
		System.out.println(numbers);
		
		TreeSet<Integer> tree = new TreeSet<Integer>(numbers);
		System.out.println(tree); // The tree set sort the numbers.
	}

}
