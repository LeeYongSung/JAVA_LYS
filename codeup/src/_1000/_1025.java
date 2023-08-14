package _1000;

import java.util.Scanner;

public class _1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[5];
		int arr2[] = {10000,1000,100,10,1};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (num / arr2[i]) * arr2[i];
			num = (num % arr2[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("[" + arr[i] + "]");
		}
		
		sc.close();
		
	}
	
}
