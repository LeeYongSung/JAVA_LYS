package _1500;

import java.util.Arrays;
import java.util.Scanner;

public class _1563 {
	
	static public void f(long a, long b, long c) {
		long arr[] = {a, b, c};
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		f(a, b, c);
		
	}
}
