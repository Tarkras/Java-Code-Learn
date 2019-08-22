package bitset;

import java.util.*;

public class BitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BitSet b1 = new BitSet();
		BitSet b2 = new BitSet();
		
		b1.set(0, true);
		b1.set(1, true);
		b1.set(2, true);
		b1.set(3, true);
		
		b2.set(0, false);
		b2.set(1, true);
		b2.set(2, false);
		b2.set(3, true);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
