package _1200;

import java.util.Scanner;

public class _1269 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			a = a * b + c;
		}
		System.out.println(a);
	}
}
