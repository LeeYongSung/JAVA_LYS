package _1500;

import java.util.Scanner;

public class _1511 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = 1;
		int sum = 0;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = count++;
			}
		}
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if(i == 0 || i == a-1) {
					sum += arr[i][j];
				}else {
					if(j==0 || j == a-1) {
						sum += arr[i][j];
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
