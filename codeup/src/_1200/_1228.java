package _1200;

import java.util.Scanner;

public class _1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("키와 몸무게를 공백을 기준으로 입력해 주세요 : ");
		double key = sc.nextDouble();
		double weight = sc.nextDouble();
		
		
		double avg_weight = (key - 100) * 0.9;
		double obesity = (weight - avg_weight) * 100 / avg_weight;
		
//		System.out.println("표준몸무게 : " + avg_weight);
//		System.out.println("비만도 : " + obesity);
		
		if(obesity <= 10) {
			System.out.println("정상");
		} else if(obesity > 10 && obesity <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		
	}
}
