package _1400;

import java.util.Scanner;

public class _1418 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		char b[] = a.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			if(b[i] == 't') System.out.print(i+1 + " ");
		}
		
		
	}
}
