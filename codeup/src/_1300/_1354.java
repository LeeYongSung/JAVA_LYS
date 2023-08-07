package _1300;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = num; i >= 1 ; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		sc.close();
	}
}
