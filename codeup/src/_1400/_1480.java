package _1400;

import java.util.Scanner;

public class _1480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] c = new int[a][b];
		int d=1;
		int sum = a+b;
		for (int k = sum; k >= -100 ; k--) { 
			for (int i = b-1; i >= 0 ; i--) {
				for (int j = 0; j < a ; j++) {
					if(j+i == k) c[j][i] = d++;
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
