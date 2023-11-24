package _1500;

import java.util.Scanner;

public class _1578 {
	static void f(int a, int b) {
		if(a < b) {
			System.out.println(b);
		} else {
			System.out.println(a);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		f(a, b);
	}
}
