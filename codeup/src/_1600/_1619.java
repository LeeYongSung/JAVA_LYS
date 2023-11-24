package _1600;

import java.util.Scanner;

public class _1619 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int s_n = 0;
		int arr[] = new int[a.length()];
		int N = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.charAt(i) - '0';
		}
		
		N = Integer.parseInt(a);
		
		for (int i = 0; i < arr.length; i++) {
			s_n += arr[i];
		}
		
		if(N % s_n == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
