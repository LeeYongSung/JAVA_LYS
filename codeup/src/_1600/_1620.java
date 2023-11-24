package _1600;

import java.util.Scanner;

public class _1620 {
	static int thReef(int sum2) {
		String sum_t2 = String.valueOf(sum2);
		
		int arr[] = new int[sum_t2.length()];
		int sum3 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sum_t2.charAt(i) - '0';
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum3 += arr[i];
		}
		
		return sum3;
	}
	
	static int twOf(int sum) {
		String sum_t = String.valueOf(sum);
		
		int arr[] = new int[sum_t.length()];
		int sum2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sum_t.charAt(i) - '0';
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		return thReef(sum2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int arr[] = new int[a.length()];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.charAt(i) - '0';
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(twOf(sum));
	}
}
