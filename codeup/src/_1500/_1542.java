package _1500;

import java.util.Scanner;

public class _1542 {
	
	static public void f(int n) {
		int a=0;
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println("composite");
				a++;
				break;
			}
		}
		if(a == 0) {
			System.out.println("prime");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		f(n);
	}
}
