package _1200;

import java.util.Scanner;

public class _1255 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		while(a <= b) {
			System.out.printf("%.2f", a);
			System.out.print(" ");
			a = a+0.01;
		}
	}
}
