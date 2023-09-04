package _1400;

import java.util.Scanner;

public class _1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]= sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(i+1+": ");
			for (int j = 0; j < a.length; j++) {
				if(i==j)continue;
				if(a[i] == a[j] )System.out.print("= ");
				else if (a[i]<a[j])System.out.print("< ");
				else if (a[i]>a[j])System.out.print("> ");
			}
			System.out.println();
		}
	}
}
