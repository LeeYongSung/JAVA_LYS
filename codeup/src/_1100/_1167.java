package _1100;

import java.util.Scanner;

public class _1167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		} else if(a < b && b > c) {
			if(a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if(a > b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		}
		sc.close();
	}
}
