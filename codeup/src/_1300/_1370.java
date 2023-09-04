package _1300;

import java.util.Scanner;

public class _1370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int k = 0; k < b; k++) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for (int i = a-2; i >= 0 ; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
