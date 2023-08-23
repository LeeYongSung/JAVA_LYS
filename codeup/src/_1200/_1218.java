package _1200;

import java.util.Scanner;

public class _1218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == b && b == c) {
			System.out.println("정삼각형");
		} else if ((a*a)+(b*b)==(c*c) || (a*a)+(c*c) == (b*b) || (b*b)+(c*c) == (a*a) ) {
			System.out.println("직각삼각형");
		} else if ( a + b <= c || a + c <= c || b + c <= a) {
			System.out.println("삼각형 아님");
		} else if ( a == b || b == c || c == a) {
			System.out.println("이등변삼각형");
		} else if (a + b < c || a + c < c || b + c < a) {
			System.out.println("삼각형");
		} else if ( a < 10 && b < c || b < 10 && a < c || c < 10 && a < c) {
			System.out.println("삼각형");
		}
		sc.close();
	}
	
}
