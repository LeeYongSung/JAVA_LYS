package _1500;

import java.util.Scanner;

public class _1502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] += count;
				System.out.print(arr[i][j] + " ");
				count += a;
			}
			count = i+2;
			System.out.println();
		}
	}
}
