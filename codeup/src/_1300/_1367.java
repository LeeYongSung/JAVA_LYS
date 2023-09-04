package _1300;

import java.util.Scanner;

public class _1367 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int count = a;
		
		
		for (int i = 0; i < a; i++) {
			for (int i2 = count; i2 > 1; i2--) {
				System.out.print(" ");
			}
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
		
	}
}
