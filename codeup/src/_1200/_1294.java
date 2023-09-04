package _1200;

import java.util.Scanner;

public class _1294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//18자리 qhyhu wuxvw euxwxv
		String a = sc.nextLine();
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if(b[i] != ' ') {
				if(b[i]+3 > 122 ) {
					switch(b[i]+3) {
					case 123 : b[i]-=23;
					break;
					case 124 : b[i]-=23;
					break;
					case 125 : b[i]-=23;
					break;
					}//switch end
				}else b[i]+=3; 
			}//if end
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		sc.close();
		
	}
}
