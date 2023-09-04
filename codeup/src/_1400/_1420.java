package _1400;

import java.util.Scanner;

public class _1420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr1[] = new int[a];
		String arr2[] = new String[a];
		
		for (int i = 0; i < a; i++) {
			arr2[i] = sc.next();
			arr1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1; j++) {
				if(arr1[j] > arr1[j+1]) {
					int temp = arr1[j];
					String temp1 = arr2[j];
					arr1[j] = arr1[j+1];
					arr2[j] = arr2[j+1];
					arr1[j+1] = temp;
					arr2[j+1] = temp1;
				}
			}
		}
		
		System.out.println(arr2[a-1]);
	}
}
