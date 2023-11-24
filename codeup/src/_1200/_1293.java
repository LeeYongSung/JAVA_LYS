package _1200;

import java.util.Arrays;
import java.util.Scanner;

public class _1293 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			int b = sc.nextInt();
			arr[i] = b;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[a-1] + " " + arr[a-a]);
		 
	}
}
