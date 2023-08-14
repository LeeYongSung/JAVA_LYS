package _1000;

import java.util.Scanner;

public class _1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] text = new String[3];
		String str2 = sc.nextLine();
		text = str2.split("\\.");
		
		System.out.println(text[2] + "-" + text[1] + "-" + text[0]);
		
		sc.close();
	}
}
