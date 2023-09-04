package _1200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _1286 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			int c = sc.nextInt();
			list.add(c);
		}
		
		Collections.sort(list);
		
		
		System.out.println(list.get(4));
		System.out.println(list.get(0));
		
	}
}
