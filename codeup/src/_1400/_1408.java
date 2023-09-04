package _1400;

import java.util.Scanner;

public class _1408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char b[] = a.toCharArray();
		
		for (int i = 0; i < b.length; i++) {
			b[i] += 2;
			System.out.print(b[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			b[i] -= 2;
			b[i] = (char) (((b[i]*7) % 80)+48);
			System.out.print(b[i]);
		}
	}
}
