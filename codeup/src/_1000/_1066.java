package _1000;

import java.util.Scanner;

public class _1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(b % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(c % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		/*
		 * String result1 = a % 2 == 1 ? "odd" : "even";
		 * String result2 = b % 2 == 1 ? "odd" : "even";
		 * String result3 = c % 2 == 1 ? "odd" : "even";
		 */ 
		
		sc.close();
	}
}
