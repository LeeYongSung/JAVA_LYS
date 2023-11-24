package _1500;

import java.util.Scanner;

public class _1557 {
	
	static public void f(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		f(n);
		
	}
}
