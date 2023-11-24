package _1500;

import java.util.Scanner;

public class _1503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = count;
					count++;
				}				
			} else {
				for (int j = a-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
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
