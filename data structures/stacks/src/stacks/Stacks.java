package stacks;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** LIFO (Last In First Out) */
		/*  The last element introduced in the stack is the first that goes out when
		 *  you remove it.*/
		
		Stack stk = new Stack();
		stk.push(1); // With push you add an element to the stack.
		stk.push(2);
		stk.push(3);
		stk.push(10);
		stk.push("hello");
		
		System.out.println(stk); // With stk.get(index) you get the element that you want,
		
		stk.pop(); // Removes the last element added. Use peek to return an element without removing it.
		
		System.out.println(stk);
	}

}
