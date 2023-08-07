package _1200;

import java.util.Scanner;

public class _1207 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int count = 0;
		
//		int sum = a + b + c + d;
		
		if(a == 1 ) count++;
		if(b == 1 ) count++;
		if(c == 1 ) count++;
		if(d == 1 ) count++;
		
		
		if(count == 0 ) System.out.println("모");
		if(count == 1 ) System.out.println("도");
		if(count == 2 ) System.out.println("개");
		if(count == 3 ) System.out.println("걸");
		if(count == 4 ) System.out.println("윷");
	}
}
