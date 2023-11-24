package _1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _1452 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			list.add(b);
		}
		
		Collections.sort(list);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
