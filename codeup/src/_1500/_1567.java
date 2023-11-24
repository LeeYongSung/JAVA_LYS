package _1500;

import java.util.Scanner;

public class _1567 {
	static Scanner sc = new Scanner(System.in);
	
	static void f(long a) {
		long arr[] = new long[(int)a];
		for (long i = 0; i < arr.length; i++) {
			arr[(int) i] = sc.nextLong();
		}
		long select_num1 = sc.nextInt();
		long select_num2 = sc.nextInt();
		long sum = 0;
		for (long i = select_num1-1; i <= select_num2-1; i++) {
			sum += arr[(int) i];
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		long a = sc.nextLong();
		
		f(a);
		
	}
}
