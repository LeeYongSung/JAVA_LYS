package _1900;

import java.util.Scanner;
public class _1905 {
		// 강사님 답안
	// public static int method(int N) {
		// 100 + 99 + 98 + ... + 1 = 5050
		// 종료조건
		// if( N == 0 ) return 0;
	
		// 재귀호출
		// 100 + 99
		// return N + method(N-1);
	// }
	
	public static void method(int num, int sum) {
		sum = sum + num;
		if(num == 0) {
			System.out.println(sum);
			return;
		}
		method(--num, sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		method(num, sum);
		
		// int result = method(N);
		// System.out.println( result );
		sc.close();
	}
}
