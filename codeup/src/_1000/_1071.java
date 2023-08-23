package _1000;

import java.util.ArrayList;
import java.util.Scanner;

public class _1071 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void num(ArrayList<Integer> list, int a) {
		
		int b = sc.nextInt();
		list.add(b);
		
		if(list.get(a) == 0) return;
		System.out.println(list.get(a));
		a++;
		num(list, a); 
	}
	
	
	public static void main(String[] args) {
		int a = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		num(list, a);
	}
}
