package _1200;

import java.util.Scanner;

public class _1276 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 1;
		
		for (int i = a; i >= 1; i--) {
			sum *= i;
		}
		System.out.println(sum);
		sc.close();
	}
}
