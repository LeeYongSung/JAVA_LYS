package _1200;

import java.util.Scanner;

public class _1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%5 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
