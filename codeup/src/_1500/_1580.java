package _1500;

import java.util.Scanner;

public class _1580 {
	static void f(double a) {
		double radius = 3.14;
		
		System.out.printf("%.2f", a*a*radius);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		f(a);
	}
}
