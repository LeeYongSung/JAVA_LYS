package Day11.Ex01_Lang;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.PI);			// 3.141592653589793
		System.out.println(Math.ceil(3.125));	// 올림 : 해당 수보다 큰 정수 중 가장 작은 수
		System.out.println(Math.floor(3.75));	// 내림 : 해당 수보다 작은 정수 중 가장 큰 수
		System.out.println(Math.sqrt(9));		// 제곱근(루트)
		System.out.println(Math.pow(3, 2));		// 3의 2제곱
		System.out.println(Math.exp(2));		// e의 2승
		System.out.println(Math.round(3.14));	// 반올림
		
		System.out.println("--------------------------------");
		
		// 로또 번호 6/45
		// [1, 45] 사이의 정수형 난수 6개 만들기
		// Math.random()					: 0.0보다 크거나같고 1.0보다 작은 임의의 실수
		// Math.random()					: 0.xxx ~ 0.9xx
		// (0.xxx ~ 0.9xx) * 10				: 0.xxx ~ 9.xxx(0 ~ 9) 10개
		// (0.xxx ~ 0.9xx) * 20				: 0.xxx ~ 19.xxx(0 ~ 19) 20개
		// (0.xxx ~ 0.9xx) * 45				: 0.xxx ~ 44.xxx(0 ~ 44) 45개
		// (0.xxx ~ 0.9xx) * 45 + 1			: 1.xxx ~ 45.xxx(1 ~ 45) 45개
		// (int)(Math.random()) * 45 + 1	: 1 ~ 45
		
		// [공식]
		// (int)(Math.random() * [개수] + [시작숫자])
		for (int i = 0; i < 6; i++) {
			int random = (int)(Math.random() * 45 + 1);
			System.out.print(random + " ");
		}
		System.out.println();
		
		// -50 ~ 50 사이의 랜덤 정수 1개를 출력하시오.
		int random2 = (int)(Math.random() * 101 + (-50));
		System.out.println(random2);
		
		System.out.println("-------------------------------");
		
		double arr[] = {98.45, 65.33, 44.45, 85.12, 70.45};
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);			
//			if(max < arr[i]) max = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
//			if(min > arr[i]) min = arr[i];
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
