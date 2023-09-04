package _1700;

import java.util.Scanner;

public class _1754 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length()<b.length())System.out.println(a+" "+b);
		else if (a.length() == b.length()) {
		if(a.compareTo(b)> 0 )System.out.println(b+" "+a);
		else System.out.println(a+" "+b);
		}else System.out.println(b+" "+a);
		sc.close();
	}
}
