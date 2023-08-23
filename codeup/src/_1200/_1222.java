package _1200;

import java.util.Scanner;

public class _1222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 축구경기 타임 90분
		// 현재 1반 0점 , 2반 2점
		// 성익이는 5분마다 골 넣을 수 있음
		// 투입부터 한골 그 후 5분마다 골 넣을 수 있음
		// 무조건 90분
		// 입력값 : 현재경기시간 현재 득점
		
		if(a < 90) {
			for (int i = a; i < 90; i+=5) {
				b++;
			}
		} else {
			System.out.println("경기 종료");
		}
		
		if(b == c) {
			System.out.println("same");			
		} else if(b > c) {
			System.out.println("win");			
		} else {
			System.out.println("lose");			
		}
	}
}
