package Day01;

import java.util.Scanner;

public class Ex04_InputDouble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		double avg = sum / 3; // float, double [ (double)sum / 3 , sum / 3.0 ] -> 강제 형 변환
		// sum - (int) / (int) : (int)
		// sum - (double) / (int) : (double)
		// (큰 자료형) + (작은 자료형) = (큰 자료형)
		// - 서로 다른 자료형 연산 시, 결과는 큰 자료형으로 반환된다.
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg 평균 변수가 정수형(int)라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용해야한다.
		
		sc.close();
	}
}