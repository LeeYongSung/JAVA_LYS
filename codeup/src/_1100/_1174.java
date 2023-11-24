package _1100;

import java.util.Scanner;

public class _1174 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		// 60분을 더하고 30분을 빼서 항상 양수가 되도록 함
        minute += (60 - 30);

        // 시간 조정
        hour = (hour + 23 + (minute / 60)) % 24;
        
        // 분 조정
        minute %= 60;

        System.out.println(hour + " " + minute);
		sc.close();
	}
}
