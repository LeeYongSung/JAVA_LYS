package Day13.Ex03_Comparator;

import java.util.Comparator;

public class User implements Comparator<User>{
	
	String id;
	String name;
	int age;
	
	// 생성자
	public User() {
		
	}
	// 매게변수를 가진 생성자
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준 1 : 나이순 - 오름차순
		// 정렬 기준 2 : 이름순 - 오름차순
		// o1의 나이가 o2의 나이보다 클 때, 양수
		// o1의 나이가 o2의 나이보다 작을 때, 음수
		// o1의 나이가 o2와 같을 때
		// o1의 이름이 o2의 이름보다 사전순으로 뒤에 있을때, 양수
		// o1의 이름이 o2의 이름보다 사전순으로 앞에 있을때, 음수
		
		String thisName = o1.name;
		String comName = o2.name;
		int thisAge = o1.getAge();
		int comAge = o2.getAge();
		
		int result1 = thisAge - comAge;
		int result2 = thisName.compareTo(comName);
		
		if(result1 == 0 ) return result2;
		
		return result1;
		
//		return result1 == 0 ? result2 : result1; // 이것도 가능
		
//		if( o1.age > o2.age ) {
//			return 1; // 1
//		} else if ( o1.age == o2.age ) {
//			int gap = thisName.compareTo(comName);
//			return gap; // 0
//		} else if ( o1.age < o2.age ){
//			return -1; // -1
//		} 
//		return 0;
	}
}
