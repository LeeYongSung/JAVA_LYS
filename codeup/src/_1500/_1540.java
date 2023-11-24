package _1500;

import java.util.Scanner;

public class _1540 {
	
	static public void a(int num) {
		int check = num;
		
		if(check == 0) {
			System.out.println("zero");
		} else {
			System.out.println("non zero");			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		a(a);
	}
}
