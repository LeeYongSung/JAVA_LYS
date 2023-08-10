package Day13.Ex01_Collection;

import java.util.Stack;

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
		stack.remove(1);						// index로 삭제
		stack.remove( (Integer) 3 );			// 객체를 지정하여 삭제
		
		for (Integer item : stack) {
			System.out.println("item : " + item);
		}
		System.out.println();
		
		stack.clear();							// 전체 요소 삭제
		System.out.println("empty : " + stack.isEmpty());
	}
	
}
