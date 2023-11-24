package _1500;

import java.util.Scanner;

public class _1564 {
	
	static public void f(int a, int b) {
		int max = 0;
		
		for (int i = 1; i <= a && i <= b; i++) {
			if(a%i == 0 && b%i == 0) {
				max = i;
			}
		}
		
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		f(a, b);
		
	}
}
