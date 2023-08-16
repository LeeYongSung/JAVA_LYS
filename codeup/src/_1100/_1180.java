package _1100;

import java.util.Scanner;

public class _1180 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = 0;
		int f = 0;
		String b = "";
		String c = "";
		String e = "";
		b = b.valueOf(a).substring(0, 1);
		c = c.valueOf(a).substring(1, 2);
//		System.out.println(b);
//		System.out.println(c);
		e = c+b;
//		System.out.println(e);
		a = Integer.parseInt(e);
		d = a*2;
		
		if(d > 100) {
			f = d-100;
			if(f <= 50) {
				System.out.println(f);
				System.out.println("GOOD");
			} else {
				System.out.println(f);
				System.out.println("OH MY GOD");
			}
		} else {
			f = d;
			if( f <= 50 ) {
				System.out.println(f);
				System.out.println("GOOD");				
			} else {
				System.out.println(f);
				System.out.println("OH MY GOD");
			}
		}
		sc.close();
	}
}
