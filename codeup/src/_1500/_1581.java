package _1500;

import java.util.Scanner;

public class _1581 {
	static void f(int a, int b) {
		if(a < b) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		f(a, b);
	}
}
