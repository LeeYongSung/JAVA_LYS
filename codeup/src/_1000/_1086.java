package _1000;

import java.util.Scanner;

public class _1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextInt();
		double b = sc.nextInt();
		
		double file_size = (w*h*b) / 8 / 1024 / 1024;
		
		System.out.printf("%.2f MB",file_size);
		
		sc.close();
	}
}
