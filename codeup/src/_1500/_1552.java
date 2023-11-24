package _1500;

import java.util.Scanner;

public class _1552 {
	
	static public void f(double n) {
		double a = (int)n;
		
		
		System.out.printf("%.14f", n-a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		f(n);
		
	}
}
