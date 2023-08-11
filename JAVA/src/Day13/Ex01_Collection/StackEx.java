package Day13.Ex01_Collection;

import java.util.Stack;

/*
 * Stack
 * : "쌓다"
 * 데이터를 한 쪽 방향에서 추가하고 삭제할 수 있는 자료구조
 * 최상위 데이터 " TOP
 * 
 * 자료추가 - Push		: Top 위에 데이터를 추가
 * 자료삭제 - Pop 		: Top 의 데이터를 삭제
 * 
 * Last In First Out(L.I.F.O / 후입선출)
 * "마지막에 추가된 데이터가 가장 먼저 삭제된다."
 */

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println();
		
		// push(요소) : 요소를 TOP 위에 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("empty : " + stack.isEmpty());
		System.out.println("1 포함 여부 : " + stack.contains(1));
		System.out.println();
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		// peek()		: TOP의 데이터를 반환
		System.out.println("TOP : " + stack.peek());
		System.out.println("size : " + stack.size());
		System.out.println();
		
		// pop()		: TOP 의 요소를 삭제
		stack.pop();
//		int remove1 = stack.pop();
//		int remove2 = stack.pop();
		stack.remove(1);						// index로 삭제
		stack.remove( (Integer) 3 );			// 객체를 지정하여 삭제
//		System.out.println("remove1 : " + remove1);
//		System.out.println("remove2 : " + remove2);
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		stack.clear();							// 전체 요소 삭제
		System.out.println("empty : " + stack.isEmpty());
	}
	
}
