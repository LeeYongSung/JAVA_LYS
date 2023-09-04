package _1300;

import java.util.Scanner;

public class _1358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			if(i%2 != 0) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}				
				System.out.println();
			} else {
				for (int j = i+2; j <= num; j+=2) {
					System.out.print(" ");
				}
			}
		}
		sc.close();
	}
}
