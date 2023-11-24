package _1400;

import java.util.Scanner;

public class _1471 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		int count = 1;
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for (int j = a-1; j >= 0; j--) {
					arr[j][i] = count;
					count++;
				}
			} 
			if(i%2 != 0){
				for (int j = 0; j < arr[i].length; j++) {
					arr[j][i] = count;
					count++;
				}
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
