package _1500;

import java.util.Scanner;

public class _1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = 1;
		
		for (int i = 0; i < a; i++) {
			if( i % 2 == 0 ) {
				for (int j = 0; j < a; j++) {
					arr[j][i] = count++;
				}				
			} else {
				for (int j = a-1; j >= 0; j--) {
					arr[j][i] = count++;					
				}				
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
