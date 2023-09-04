package _1000;

import java.util.Scanner;

public class _1084 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < g; j++) {
				for (int z = 0; z < b; z++) {
					System.out.print(i + " " + j + " " + z);
					System.out.println();
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
		
		sc.close();
		
	}
}
