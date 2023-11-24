package _1500;

import java.util.Scanner;

public class _1577 {
	static void f(int a) {
		if(a < 0) {
			a = -a;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		f(a);
	}
}
