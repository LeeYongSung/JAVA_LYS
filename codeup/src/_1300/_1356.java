package _1300;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(i == 1 || i == num) {
				for (int j = 1; j <= num ; j++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for (int j = 0; j <num-2 ; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		sc.close();
	}
}
