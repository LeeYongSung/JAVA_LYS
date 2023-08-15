package _1100;

import java.util.Scanner;

public class _1169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		int year = 2012 - age + 1;
		int info = 0;
		String a = "";
		a = a.valueOf(year).substring(2, 4);
		year = Integer.parseInt(a);
		
		if(age < 14) {
			System.out.println(year + " " + 3);
		} else {
			System.out.println(year + " " + 1);
		}
		sc.close();
	}
}
