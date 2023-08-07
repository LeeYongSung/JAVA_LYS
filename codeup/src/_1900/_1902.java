package _1900;

import java.util.Scanner;
public class _1902 {
	public static void method(int num) {
		System.out.println(num);
		if(num == 1) return;
		method(num - 1);
		
		// 강사님 답안
//		if(num == 0) return;
//		System.out.println(num);
//		method(--num);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		method(num);
		sc.close();
	}
}
