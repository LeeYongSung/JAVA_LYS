package _1200;

import java.util.Scanner;

public class _1270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if(i % 10 == 1) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
