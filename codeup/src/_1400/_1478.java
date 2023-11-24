package _1400;

import java.util.Scanner;

public class _1478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d=1;
		int sum = a+b;
		for (int k = sum; k >= -100 ; k--) {
			for (int i = 0; i < a ; i++) {
				for (int j = 0; j < b ; j++) {
					if(j-i == k) c[i][j] = d++;
				}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
