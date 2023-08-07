package Day04.Ex07_02_AccessModifier;

import Day04.Ex07_01_AccessModifier.Person;

public class Student extends Person {

	// 생성자
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		// TODO Auto-generated constructor stub
	}
	
	public void defaultSetting() {
		name = "이름없음";
		height = 160;
		//age = 20;			// default 라서 같은 패키지에서만 접근 가능 //person은 같은 패키지가 아니다.
		//weight = 40;		// private 라서 해당 ㅡㄹ래스에서마 접근 가능 //person 클래스 안에서만 접근 가능
		setAge(20);
		setWeight(40);
	}

	
}
