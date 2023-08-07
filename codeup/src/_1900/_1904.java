package _1900;

import java.util.Scanner;
public class _1904 {
	public static void method(int num1, int num2) {
		if(num1%2 == 1)
			System.out.print(num1 + " ");
		if(num1 == num2) return;
		method(++num1, num2);
		
		//강사님 답안 동일
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		method(num1, num2);
		sc.close();
	}
}
