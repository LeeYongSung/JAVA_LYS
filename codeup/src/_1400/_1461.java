package _1400;

import java.util.Scanner;

public class _1461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int b = a;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] += b;
				System.out.print(arr[i][j] + " ");
				b--;
			}
			b = a;
			b *= i+2;
			System.out.println();
		}
	}
}
