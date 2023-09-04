package _1400;

import java.util.Scanner;

public class _1419 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		int cnt=0;
		for (int i = 0; i < b.length; i++) {
			if(i != b.length-3)
			if(b[i]=='l')
				if(b[i+1]=='o')
					if(b[i+2]=='v')
						if(b[i+3]=='e')cnt++;
		}
		System.out.println(cnt);
	}
}
