package _1200;

import java.util.Scanner;

public class _1203 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a <= 10) {
			System.out.println("정상");
		} else if(a <= 20) {
			System.out.println("과체중");
		} else if(a > 20) {
			System.out.println("비만");			
		} 
		sc.close();
	}
	
}
