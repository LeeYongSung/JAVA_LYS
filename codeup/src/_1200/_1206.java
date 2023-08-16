package _1200;

import java.util.Scanner;

public class _1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if(a < b) {
			if(b % a == 0) {
				b = b / a;
				c = a*b;
				System.out.println(a + "*" + b + "=" + c);
			} else {
				System.out.println("none");
			}
		} else if(a > b){
			if(a % b == 0) {
				a = a / b;
				c = a*b;
				System.out.println(a + "*" + b + "=" + c);
			} else {
				System.out.println("none");
			}
		} else {
			b = a / b;
			c= a*b;
				System.out.println(a + "*" + b + "=" + c);
		}
	}
}
