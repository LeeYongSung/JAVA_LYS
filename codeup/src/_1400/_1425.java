package _1400;

import java.util.Scanner;

public class _1425 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < b; i++) {
			System.out.print(arr[i] + "\n");
		}
		for (int i = b; i < a; i++) {
			System.out.print(arr[i] + "\n");
		}
	}
}
