package _1500;

import java.util.Scanner;

public class _1555 {
	
	static public void f(long n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		f(n);
		
	}
}
