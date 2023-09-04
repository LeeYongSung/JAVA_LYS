package _1300;

import java.util.Scanner;

public class _1380 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i < a; i++) {
			if(i < 7 && a-i<7) {
				System.out.print(i);
				System.out.print(" ");
				System.out.print(a - i);
				System.out.println();
			}
		}
	}
}
