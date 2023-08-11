package Day13.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class UserList {
	
	public static void main(String[] args) {
		
		User user1 = new User("1", "김조은", 13);
		User user2 = new User("2", "이조은", 15);
		User user3 = new User("3", "박조은", 13);
		User user4 = new User("4", "최조은", 13);
		User user5 = new User("5", "강조은", 15);
		User user6 = new User("6", "구조은", 31);
		User user7 = new User("7", "정조은", 31);
		User user8 = new User("8", "안부평", 15);
		
		LinkedList<User> userList = new LinkedList<User>();
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		userList.add(user6);
		userList.add(user7);
		userList.add(user8);
		
		// Collections.sort (리스트, Comparator 구현객체)
		// - 오버라이딩한 compare 메소드의 기준에 따라서 정렬한다
		Collections.sort(userList, new User());
		
		for (User user : userList) {
			System.out.println("id : " + user.id + ", name : " + user.name + ", age : " + user.age);
		}
	}
	
}
