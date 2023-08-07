package _1900;

import java.util.Scanner;
public class _1915 {
	public static void method(int num, int sum, int a, int count) {
		System.out.println(sum);
		
		if(sum == 1) {
			sum++;
		} else if (sum == 2) {
			sum = sum + a;
			a++;
		} else if(sum >= 3) {
			
		}
		
		++count;
		if(num == count) {
			return;
		}
		method(num, sum, a, count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 1;
		int a = 0;
		int count = 0;
		method(num, sum, a, count);
		
		sc.close();
	}
}
