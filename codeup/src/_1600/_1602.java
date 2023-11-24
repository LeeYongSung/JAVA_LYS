package _1600;

import java.util.Scanner;

public class _1602 {
	static void abs(double a) {
		
		if(a%1 == 0.0) {
			if(a < 0) {
				System.out.println((int)-a);
			} else {
				System.out.println((int)a);
			}			
		} else {
			if(a < 0) {
				System.out.println(-a);
			} else {
				System.out.println(a);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		abs(a);
	}
}
