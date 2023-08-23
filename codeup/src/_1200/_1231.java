package _1200;

import java.util.Scanner;

public class _1231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = a.split("");
		int c = Integer.parseInt(b[0]+b[1]);
		int d = Integer.parseInt(b[3]+b[4]);
		switch (a.charAt(2)) {
		case '+': System.out.println(c+d); break;
		case '-': System.out.println(c-d); break;
		case '*': System.out.println(c*d); break;
		case '/': System.out.println(c/d); break;
		}
		sc.close();
	}
}
