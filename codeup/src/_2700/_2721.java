package _2700;

import java.util.Scanner;

public class _2721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		char[] d = a.toCharArray();
		char[] e = b.toCharArray();
		char[] f = c.toCharArray();
		if(d[0] == f[f.length-1]) {
			if(e[0]==d[d.length-1]) {
				if(f[0]==e[e.length-1]) {
					System.out.println("good");
				}else System.out.println("bad");
			}else System.out.println("bad");
		}else System.out.println("bad");
	}
}
