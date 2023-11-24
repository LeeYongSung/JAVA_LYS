package _1200;

import java.util.Arrays;
import java.util.Scanner;

public class _1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a*b;
		}
		
		
		Arrays.sort(arr);
		
		System.out.println(arr[2]);
	}
}
