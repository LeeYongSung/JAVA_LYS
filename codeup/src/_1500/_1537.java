package _1500;

import java.util.Scanner;

public class _1537 {
	
	static public void a(int num) {
		int check = num;
		
		if(check == 1) {
			System.out.println("hello");
		} else {
			System.out.println("world");			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		a(a);
	}
}
