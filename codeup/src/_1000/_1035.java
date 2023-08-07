package _1000;

import java.util.Scanner;

public class _1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		int a = Integer.parseInt(text, 16);
		
		String text2 = Integer.toOctalString(a);
		
		
		System.out.println(text2);
	}
}
