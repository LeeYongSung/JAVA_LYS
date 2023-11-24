package _1500;

import java.util.Scanner;

public class _1556 {
	
	static public void f(int n) {
		int mul = 1;
		
		for (int i = n; i > 0; i--) {
			mul *= i;
		}
		
		System.out.println(mul);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		f(n);
		
	}
}
