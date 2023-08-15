package _1100;

import java.util.Arrays;
import java.util.Scanner;

public class _1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Integer[] list = {a,b,c};
		
		Arrays.sort(list);
		
		for (Integer ls : list) {
			System.out.print(ls + " ");
		}
		
		sc.close();
	}
}
