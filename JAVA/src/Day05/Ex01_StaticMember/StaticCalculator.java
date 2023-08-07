package Day05.Ex01_StaticMember;

class Calculator {
//	아래 연산 결과를 구하는 메소드를 작성하시오.
//	1. 절대값
//	2. 최댓값
//	3.최솟값
	public static int abs(int val) {
		return val > 0 ? val : -val;

	}

	public static int max(int arr[]) {
		int max = Integer.MIN_VALUE;
				for (int i : arr) {
					if(max<i)
						max = i;
				}
		return max;
	}

	public static int min(int arr[]) {
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (min > i)
				min = i;
		}
		return min;
	}
}

public class StaticCalculator {
	public static void main(String[] args) {
		int arr[] = {70,90,85,50,100};
		
//		참조자료형임에도 클래스 호출 및 변수 정의가 없음!!!!!!!!!!!
		
		
		
//		다른 클래스의 static 메소드를 호출할 때는,
//		클래스,메소드명(); 형태로 메소드를 호출한다.
		
		System.out.println("abs(-123) : "+Calculator.abs(-123));		//참조자료형임에도 클래스 호출 및 변수 정의가 없음!!!!!!!!!!!
		System.out.println("max(arr) = "+ Calculator.max(arr));			//참조자료형임에도 클래스 호출 및 변수 정의가 없음!!!!!!!!!!!
		System.out.println("min(arr) = " + Calculator.min(arr));		//참조자료형임에도 클래스 호출 및 변수 정의가 없음!!!!!!!!!!!
		
		Math.random();
	}
}
