package _1100;

import java.util.Scanner;

public class _1162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		int cal = (year-(month+day));
		
		String a = String.valueOf(cal).substring(3);
		
		int num = Integer.parseInt(a);
		
//		System.out.println(num);
		if( num == 0 ) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
		sc.close();
	}
}
