package _1500;

import java.util.Scanner;

public class _1549 {
	
	static public void abs(String n) {
		
		long check = Long.parseLong(n);
		if(check < 0) {
			System.out.println(-check);
		} else if(check == 0) {
			System.out.println(0);			
		} else {
			System.out.println(check);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		abs(n);
		
	}
}
