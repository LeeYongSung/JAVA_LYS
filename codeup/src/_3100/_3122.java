package _3100;

import java.util.Scanner;

public class _3122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) { // 위 마름모
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2*i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for (int i = n-1; i >= 0; i--) { // 아래 마름모
			for (int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2*i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
