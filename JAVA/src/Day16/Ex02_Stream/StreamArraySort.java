package Day16.Ex02_Stream;

import java.util.Arrays;

public class StreamArraySort {

	public static void main(String[] args) {
		int arr[] = {10, 5, 2, 4, 3};
		
		// Arrays.sort(arr);		// arr 배열에 정렬을 적용 O
		
		int soredArr[] = Arrays.stream(arr).sorted().toArray();
		
		System.out.println("기본 배열에 정렬을 적용X");		
		for (int i : arr) {
			System.out.print(i + " ");
		}		
		System.out.println("\n");
		
		System.out.println("복사된 배열에 정렬을 적용O");		
		System.out.println("- 오름차순 정렬");
		for (int i : soredArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("- 내림차순 정렬");
		Object reversedArr[] = Arrays.stream(arr).boxed().sorted((a, b) -> b-a).toArray();
		
		for (Object obj : reversedArr) {
			System.out.print((Integer) obj + " ");
		}
		System.out.println();
		
		
		// sorted + forEach
		Arrays.stream(arr).sorted().forEach( (n)-> System.out.print(n + " ") );
	}
	
}
