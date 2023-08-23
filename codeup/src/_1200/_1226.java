package _1200;

import java.util.ArrayList;
import java.util.Scanner;

public class _1226 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int result = 0;
		int bonus = 0;
		for (int i = 0; i < 7; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		for (int i = 0; i < 6; i++) {
			int b = sc.nextInt();
			list2.add(b);
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if(list.get(i) == list2.get(j)) {
					result++;
				}
			}
		}
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < list2.size(); j++) {
				if(list.get(6) == list2.get(j)) {
					bonus++;
				}
			}
		}
		
		if(result == 6) {
			System.out.println("1");
		} else if( result+bonus == 6 ) {
			System.out.println("2");
		} else if( result == 5) {
			System.out.println("3");
		} else if( result == 4) {
			System.out.println("4");
		} else if( result == 3) {
			System.out.println("5");
		} else {
			System.out.println("0");
		}
		sc.close();
	}
}
