package _1500;

import java.util.Scanner;

public class _1508_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			result = arr[i];
			for (int j = 1; j <= i; j++) {
				arr[j] = arr[j] - arr[j-1];
			}
			System.out.println(result);
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println();
		
		sc.close();
	}
}
