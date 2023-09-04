package _1400;

import java.util.Scanner;

public class _1409 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int a = sc.nextInt();
		
		System.out.println(arr[a-1]);
	}
}
