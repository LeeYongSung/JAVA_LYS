package _1200;

import java.util.Scanner;

public class _1257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}
