package _1500;

import java.util.Scanner;

public class _1544 {
	
	static public void f(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		f(n);
	}
}
