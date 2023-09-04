package _1000;

import java.util.Scanner;

public class _1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[19][19];
		
		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x-1][y-1] = 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
