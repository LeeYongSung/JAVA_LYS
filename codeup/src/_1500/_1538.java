package _1500;

import java.util.Scanner;

public class _1538 {
	
	static public void a(int num) {
		int check = num;
		
		if(check%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		a(a);
	}
}
