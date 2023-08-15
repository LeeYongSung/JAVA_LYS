package _1100;

import java.util.Scanner;

public class _1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		if(hour != 0) {
			if(minute < 30) {
				System.out.println(hour-1 + " " + (minute + 30));
			} else {
				System.out.println(hour + " " + (minute - 30));
			}			
		} else {
			hour = 24;
			if(minute < 30) {
				System.out.println(hour-1 + " " + (minute + 30));
			} else {
				hour = 0;
				System.out.println(hour + " " + (minute - 30));
			}
		}
		
		sc.close();
	}
}
