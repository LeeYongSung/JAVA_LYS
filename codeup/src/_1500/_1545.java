package _1500;

import java.util.Scanner;

public class _1545 {
	
		static public void zero(int n) {
			System.out.print("zero");
	}
	static public void nonzero(int n) {
			System.out.print("non zero");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 0) {
			nonzero(n);			
		} else if(n == 0) {
			zero(n);			
		} else {
			nonzero(n);			
		}
		
	}
}
