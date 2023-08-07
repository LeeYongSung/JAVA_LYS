package _1900;

import java.util.Scanner;
public class _1901 {
	public static void method(int num) {
		
		if(num == 0) return;
		method(num-1);
		System.out.println(num);
		
		// 강사님 답안
//		method(--num);
//		System.out.println(num+1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		method(num);
		sc.close();
	}
}
