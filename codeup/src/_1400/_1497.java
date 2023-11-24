package _1400;

import java.util.Scanner;

public class _1497 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < b.length; i+=2) {
			if(i != b.length-1) {
				sum = b[i] < b[i+1] ? b[i+1] : b[i];
				System.out.print(sum + " ");
			}
		}
	}
}
