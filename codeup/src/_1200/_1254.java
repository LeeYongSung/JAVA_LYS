package _1200;

import java.util.Scanner;

public class _1254 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		
		for (int i = a; i <= b; i++) {
			System.out.print((char)i + " ");
		}
	}
}
