package Day02;

public class Ex15_OddEven {

	public static void main(String[] args) {
		//1~20 까지의 정수 중,
		// 홀수의 합계, 짝수의 합계를 가각 구하여 출력하시오.
		int a = 1; //a = 0;
		int Even_sum = 0;
		int Odd_sum = 0;
		while(a <= 20) { // (a++ < 20)
			if(a % 2 == 0) { // 짝수
				Even_sum += a++;
				
				// Even_sum = Even_sum + a++;
				
				// Even_sum = Even_sum + a;
				// a++;
			} else { // 홀수
				Odd_sum += a++;
			}
			// a++;
		}

		System.out.println("홀수의 합 : " + Odd_sum);
		System.out.println("짝수의 합 : " + Even_sum);
	}
}
