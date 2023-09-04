package _1200;

import java.util.Scanner;

public class _1277 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr[0] + " " + arr[a/2] + " " + arr[a-1]);
		sc.close();
	}
}
