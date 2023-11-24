package _1600;

import java.util.Scanner;

public class _1610 {
	static Scanner sc = new Scanner(System.in);
	
	static void f(String a) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(a.substring(num1, num1+num2));
	}
	
	public static void main(String[] args) {
		
		String a = sc.next();
		
		f(a);
	}
}
