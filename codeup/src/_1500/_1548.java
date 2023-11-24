package _1500;

import java.util.Scanner;

public class _1548 {
	
	static public void f(int n) {
		String grades = "";
		
		if(n >= 90) {
			grades = "A";
		} else if(n >= 80) {
			grades = "B";
		} else if(n >= 70) {
			grades = "C";
		} else if(n >= 60) {
			grades = "D";
		} else {
			grades = "F";
		}
		
		System.out.println(grades);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		f(n);
		
	}
}
