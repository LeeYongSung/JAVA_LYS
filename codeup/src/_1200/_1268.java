package _1200;

import java.util.Scanner;

public class _1268 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if(num %2 == 1) {
				sum++;
			}
		}
		System.out.println(sum);

		sc.close();
	}
}
