package _1500;

import java.util.Scanner;

public class _1551 {
	static Scanner sc = new Scanner(System.in);
	
	static public void f(int n) {
		int arr[] = new int[n];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		int check = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == check) {
				count++;
				break;
			} else {
				count++;				
			}
		}
		
		if(check != arr[count-1]) {
			System.out.println(-1);			
		} else {
			System.out.println(count);			
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		f(n);
		
	}
}
