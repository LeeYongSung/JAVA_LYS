package _1200;

import java.util.Scanner;

public class _1288 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int minus = n-r;
		int sum1 = 1;
		int sum2 = 1;
		int sum3 = 1;
		
		for (int i = n; i >= 1; i--) {
			sum1 *= i;
		}
		for (int i = minus; i >= 1; i--) {
			sum2 *= i;
		}
		for (int i = r; i >= 1; i--) {
			sum3 *= i;
		}
		
		System.out.println(sum1/(sum2*sum3));
		
	}
}
