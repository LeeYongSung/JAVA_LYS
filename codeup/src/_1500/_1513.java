package _1500;

import java.util.Scanner;

public class _1513 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int b = 1;
		int c = 1;
		
		for (int i = a-1; i >= 1; i--) {
			if (c == 1) {
				int x = a-1;
				for (int j = a-i+1; j <= a-1; j++) {
					arr[x--][j] = b++;
				}
				c = -1;
			} else {
				int x = a-i+1;
				for (int j = a-1; j >= a-i+1; j--) {
					arr[x++][j] = b++;
				}
				c = 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
