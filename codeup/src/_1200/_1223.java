package _1200;

import java.util.Scanner;

public class _1223 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		if(a/b > c/d) {
			System.out.println(">");
		} else if (a/b == c/d) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}
	}
	
}
