package _1400;

import java.util.Scanner;

public class _1405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[j]+ " ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}
}
