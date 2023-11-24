package _1500;

import java.util.Scanner;

public class _1565 {
	static long gdc(long a, long b) {
		long max = 0;
		
		for (long i = 1; i <= a && i <= b; i++) {
			if(a%i == 0 && b%i == 0) {
				max = i;
			}
		}
		
		
		return max;
		
	}
	
	static void lcm(long a, long b) {
		long lCm = a*b / gdc(a, b);
		System.out.println(lCm);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		lcm(a, b);
		
	}
}
