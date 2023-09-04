package _1400;

import java.util.Scanner;

public class _1465 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[][] = new int[a][b];
		int count = a*b;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = b - 1; j >= 0; j--) {
				arr[i][j] = count;
				count--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
