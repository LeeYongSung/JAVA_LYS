package _1400;

import java.util.Scanner;

public class _1414 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] b = a.toCharArray();
		int cnt1=0;
		int cnt2=0;
		
		for (int i = 0; i < b.length; i++) {
			if(b[i]=='c'||b[i]=='C')cnt1++;
			if(i != b.length-1) {
				if((b[i] =='c' ||b[i] =='C') &&(b [i+1] == 'C'||b[i+1] == 'c'))cnt2++;
			}
		}
		System.out.println(cnt1);
		System.out.println(cnt2);
	}
}
