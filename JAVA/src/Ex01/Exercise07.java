package Ex01;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int deposit = 0;
		int withdraw = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int N = sc.nextInt();
			String check = "";
			
			
			
			
			if(N == 4) break;
			// 작성 위치
			switch (N) {
				case 1: 
						check = "예금";
						break;
				case 2: 
						check = "출금";
						break;
				case 3: 
						check = "잔고";
						break;
			}
			
			if(check.equals("예금")) {
				System.out.print("입금액을 입력해주세요 : ");
				deposit = sc.nextInt();
				balance += deposit;
				System.out.println(deposit + "원이 입금되어 총 " + balance + "원 있습니다.");
			} else if(check.equals("출금")) {
				withdraw = sc.nextInt();
				if(deposit-withdraw < 0) {
					System.out.println("잔고가 부족합니다.");
					continue;
				} else {
					balance -= withdraw;
					System.out.println(withdraw + "원이 출금되어 총 " + balance + "원 있습니다.");
				}
			} else if (check.equals("잔고")) {
				System.out.println(balance + "원 있습니다.");
			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
