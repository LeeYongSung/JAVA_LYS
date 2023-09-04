package _1200;

import java.util.Scanner;

public class _1278 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int length = (int)(Math.log10(a)+1);
		
		System.out.println(length);
		sc.close();
	}
}
