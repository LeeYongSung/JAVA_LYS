package _1200;

import java.util.Scanner;

public class _1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		int e = a+b;
		switch (a) {
		case 1: c = 400; break;
		case 2: c = 340;  break;
		case 3: c = 170;  break;
		case 4: c = 100;  break;
		case 5: c = 70;  break;
		}
		
		switch (b) {
		case 1: d = 400; break;
		case 2: d = 340;  break;
		case 3: d = 170;  break;
		case 4: d = 100;  break;
		case 5: d = 70;  break;
		}
		
		if(c+d > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");			
		}
	}
	
}
