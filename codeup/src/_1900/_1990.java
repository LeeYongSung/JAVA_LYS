package _1900;

import java.util.Scanner;

public class _1990 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();//아스키코드 숫자 -48 하면 정수 로변환
		char[] b = a.toCharArray();
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			sum += (b[i]-48);
		}
		if(sum % 3 == 0)System.out.println("1");
		else System.out.println("0");
	}
}
