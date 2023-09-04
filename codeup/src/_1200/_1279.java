package _1200;

import java.util.Scanner;

public class _1279 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			if(i%2 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
