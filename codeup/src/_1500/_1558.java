package _1500;

import java.util.Scanner;

public class _1558 {
	
	static public void f(long n) {
		String a = "";
		String b = a.valueOf(n);

		char arr[] = b.toCharArray();
		char reverseArr[] = new char[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			reverseArr[arr.length-1-i] = arr[i];
		}
		
		String reverse = new String(reverseArr);
		System.out.println(reverseArr);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		f(n);
		
	}
}
