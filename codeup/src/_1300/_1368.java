package _1300;

import java.util.Scanner;

public class _1368 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = a;
		String arrow = sc.next();
		
		if(arrow.equals("L")) {
			for (int i = 0; i < a; i++) {
				for (int i2 = 0; i2 < i; i2++) {
					
					System.out.print(" ");
				}
				for (int j = 0; j < b; j++) {
					System.out.print("*");
				}
				count--;
				System.out.println();
			}			
		} else if(arrow.equals("R")) {
			for (int i = 0; i < a; i++) {
				for (int i2 = count; i2 > 1; i2--) {
					System.out.print(" ");
				}
				for (int j = 0; j < b; j++) {
					System.out.print("*");
				}
				count--;
				System.out.println();
			}
		}
	}
}
