package _1000;

import java.util.Scanner;

public class _1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double h = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double s = sc.nextInt();
		
		double file_size = (h*b*c*s) / 8 / 1024 / 1024;
		
		System.out.printf("%.1f MB",file_size);
		
		sc.close();
	}
}
