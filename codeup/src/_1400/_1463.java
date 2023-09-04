package _1400;

import java.util.Scanner;

public class _1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = a;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] += count;
				System.out.print(arr[i][j] + " ");
				count += a;
			}
			count = a;
			count -= i + 1;
			System.out.println();
		}
	}
}
