package _1400;

import java.util.Scanner;

public class _1410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt1=0;
		int cnt2=0;
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '(')cnt1++;
			else if (a.charAt(i) == ')')cnt2++;
		}
		System.out.println(cnt1 +" "+ cnt2);
	}
}
