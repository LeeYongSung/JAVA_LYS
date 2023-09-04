package _1400;

import java.util.Scanner;

public class _1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int b = sc.nextInt();
			arr[i] = b;
		}
		
		do {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			count++;
		} while (count != 2);
		
	}
}
