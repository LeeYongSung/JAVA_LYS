package _1400;

import java.util.Scanner;

public class _1469 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int sw = 1;
		int k = 1;
		 for (int i = 0; i < N; i++) {
			if(sw == 1) {
				for (int j = N-1; j >= 0; j--) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = 0; j < N; j++) {
					arr[i][j] = k++;
				}
			}
			sw = sw * (-1);
		}
		 for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
