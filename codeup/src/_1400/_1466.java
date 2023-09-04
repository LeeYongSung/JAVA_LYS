package _1400;

import java.util.Scanner;

public class _1466 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		int count = a*b;
		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				arr[j][i] = count;
				count--;
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
