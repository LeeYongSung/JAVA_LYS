package _1500;

import java.util.Scanner;

public class _1560 {
	
	static public void f(long a, long b) {
		long sub = 0;
		if(a < b) {
			sub = b-a; 
		} else {
			sub = a-b;
		}
		
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		f(a, b);
		
	}
}
