package _1200;

import java.util.Scanner;

public class _1212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if( a > b ) {
			d = a;
		} else {
			d = b;			
		}
		
		if(c > d) {
			d = c;
		}
		if(d < (a+b+c)-d) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
}
