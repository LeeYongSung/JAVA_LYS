package _1000;

import java.util.Scanner;

public class _1094 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
			int b = sc.nextInt();
			arr[i] = b;
		}
        
        for (int i = a-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
