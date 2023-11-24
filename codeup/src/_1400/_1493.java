package _1400;

import java.util.Scanner;

public class _1493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int[][] d = new int[a][b];
		int sum=0;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				c[i][j] = sc.nextInt();
				for (int k = 0; k <= i; k++) {
					for (int l = 0; l <= j; l++) {
						sum += c[k][l];
					}
				}
				d[i][j]= sum;
				sum=0;
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}
}
