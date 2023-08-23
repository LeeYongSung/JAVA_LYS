package _1000;

import java.util.Scanner;

public class _1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int sum = a;
		for (int i = 1; i < n; i++) {
			sum += b;
		}
		System.out.println(sum);
		sc.close();
	}
}
