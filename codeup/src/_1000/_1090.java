package _1000;

import java.util.Scanner;

public class _1090 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long n = sc.nextInt();
		long sum = a;
		for (int i = 1; i < n; i++) {
			sum *= b;
		}
		System.out.println(sum);
		sc.close();
	}
}
