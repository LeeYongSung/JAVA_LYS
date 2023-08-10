package Day13.Ex01_Collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		
		// 1,2,3,4,5
		System.out.println( set.add(1) );
		System.out.println( set.add(2) );
		System.out.println( set.add(3) );
		System.out.println( set.add(4) );
		System.out.println( set.add(5) );
		System.out.println();
		
		for (Integer item : set) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		// 이미 존재하는 3, 5를 추가
		System.out.println( set.add(3) );
		System.out.println( set.add(5) );
		System.out.println();
		
		for (Integer item : set) {
			System.out.println("item : " + item);			
		}
		System.err.println();
		
		set.remove(3);
		set.remove(5);
		System.out.println("size : " + set.size());
		System.out.println();
		
		for (Integer item : set) {
			System.out.println("item : " + item);			
		}
	}
	
}