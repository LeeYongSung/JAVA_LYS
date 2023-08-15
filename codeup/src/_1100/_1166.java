package _1100;

import java.util.Scanner;

public class _1166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		// 년도 입력 받음
		// 400의 배수면 무조건 윤년
		// 4의 배수이며, 100의 배수가 아니면 윤년
		
		if(a%400 == 0) {
			System.out.println("Leap");
		} else if(a%4 == 0 && a%100 != 0) {
			System.out.println("Leap");
		} else {
			System.out.println("Normal");
		}
		
		sc.close();
	}
}
