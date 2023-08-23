package _1200;

import java.util.Scanner;

public class _1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a%4==0 && a%100!=0 || a%400 ==0) {
			if(b==2) {
				System.out.println("29");
			} else if(b%2==0) {
				System.out.println("31");
			} else if (b%2!=0) {
				System.out.println("30");
			}
		} else {
			if(b==2) {
				System.out.println("28");
			} else if (b==1) {
				System.out.println("31");
			} else if (b%2==0) {
				System.out.println("31");
			} else if (b%2!=0) {
				System.out.println("30");
			}
		}
	}
	
}
