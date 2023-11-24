package _1100;

import java.util.Scanner;

public class _1127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double sum = 0.0;
		
		for (int i = 0; i < 3; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			sum += a*b;
		}
		System.out.printf("%.1f", sum);
	}
}
