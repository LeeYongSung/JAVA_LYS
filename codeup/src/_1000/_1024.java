package _1000;

import java.util.Scanner;

public class _1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.next();
		int arr = text.length();
		
		for (int i = 0; i < arr; i++) {
			System.out.println("'" + text.charAt(i) + "'");
		}
		
		sc.close();
	}
	
}
