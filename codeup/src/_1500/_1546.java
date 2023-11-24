package _1500;

import java.util.Scanner;

public class _1546 {
	
	static public void zero(int n) {
			System.out.print("zero");
	}
	static public void minus(int n) {
			System.out.print("minus");
	}
	static public void plus(int n) {
		System.out.print("plus");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 0) {
			minus(n);
		} else if(n == 0) {
			zero(n);
		} else {
			plus(n);
		}
		
	}
}
