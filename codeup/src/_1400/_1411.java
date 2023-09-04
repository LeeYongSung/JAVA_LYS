package _1400;

import java.util.Scanner;

public class _1411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr1[] = new int[a-1];
		int arr2[] = new int[a];
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i + 1; 
		}
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum2 += arr2[i];
		}
		System.out.println(sum2 - sum1);
	}
}
