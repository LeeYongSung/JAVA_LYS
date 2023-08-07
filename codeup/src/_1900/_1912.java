package _1900;

import java.util.Scanner;
public class _1912 {
	public static void method(int num, int sum) {
		if(num == 0) {
			System.out.println(sum);
			return;
		}
		sum = sum * num;
		method(num-1, sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 1;
		method(num, sum);
		
		sc.close();
	}
}
