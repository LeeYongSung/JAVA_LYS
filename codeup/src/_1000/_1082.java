package _1000;

import java.util.Scanner;

public class _1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		for (int i = 0; i < 1; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.println(a + "*" + Integer.toHexString(j).toUpperCase()
						+ "=" + Integer.toHexString(Integer.parseInt(Integer.toHexString(j), 16) 
								                       * Integer.parseInt(a, 16)).toUpperCase());
			}
		}
	}
}
