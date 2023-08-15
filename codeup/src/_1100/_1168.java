package _1100;

import java.util.Scanner;

public class _1168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		int d = 0;
		
		String c = "";
		c = a.substring(0, 2);
		d = Integer.parseInt(c);
		
		switch (b) {
		// 1900년대 남자
		case 1: 
				d = 1900 + d;
				System.out.println(2012 -d + 1);
				break;
		// 1900년대 여자
		case 2:
				d = 1900 + d;
				System.out.println(2012-d+1);
				break;
		// 2000년대 남자
		case 3:
				d = 2000 + d;
				System.out.println(2012-d+1);
				break;
		// 2000년대 여자
		case 4:
				d = 2000 + d;
				System.out.println(2012-d+1);
				break;
		}
		sc.close();
	}
}
