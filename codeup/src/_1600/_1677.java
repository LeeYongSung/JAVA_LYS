package _1600;

import java.util.Scanner;

public class _1677 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if(i == 0 || i == a-1) {
					if(j == 0 || j == b-1) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				} else if(j == 0 || j == b-1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
