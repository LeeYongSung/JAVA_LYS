package Day05.Review;

import java.util.Scanner;
/*
 * ########## 메 뉴 판 ##########
 * 1. 굽네치킨 - 볼케이노 치킨
 * 2. BBQ - 황금올리브 닭다리 치킨
 * 3. 교촌치킨 - 허니콤보 치킨
 * 4. BHC - 뿌링클 치킨
 * 5. 레드락 치킨 - 양념치킨
 * 0. 종료
 * ########## 입력 : 
 * 
 * 메뉴번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
 * "(해당메뉴) 이 주문되었습니다." 라고 출력하시오.
 * 0을 입력하기 저가지 반복하고, 
 * 0을 입력하면 반복을 종료합니다.
 * 종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
 */
public class Ex07_ChickenMenu {
	// static 없으며 객체 생성해야함
	// 메뉴 출력
	public static void showMenu() {
		System.out.println("########## 메 뉴 판 ##########");
		System.out.println("1. 굽네치킨 - 볼케이노 치킨");
		System.out.println("2. BBQ - 황금올리브 닭다리 치킨");
		System.out.println("3. 교촌치킨 - 허니콤보 치킨");
		System.out.println("4. BHC - 뿌링클 치킨");
		System.out.println("5. 레드락 치킨 - 양념치킨");
		System.out.println("0. 종료");
		System.out.print("########## 입력 : ");
	}
	
	// 메뉴 선택
	public static String selectMenu(int menu) {
		String menuName = "";
		switch (menu) {
			case 1: menuName = "굽네치킨 - 볼케이노 치킨이 주문되었습니다"; break;
			case 2: menuName = "BBQ - 황금올리브 닭다리 치킨이 주문되었습니다"; break;
			case 3: menuName = "교촌치킨 - 허니콤보 치킨이 주문되었습니다"; break;
			case 4: menuName = "BHC - 뿌링클 치킨이 주문되었습니다"; break;
			case 5: menuName = "레드락 치킨 - 양념치킨이 주문되었습니다"; break;
		}
		return menuName;
	}
	
	public static void main(String[] args) {
		int menu = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		do {			
			showMenu(); 					// 메뉴판 출력
			menu = sc.nextInt();
			
			// 종료조건
			if(menu == 0) break;
			menuName = selectMenu(menu);	// 메뉴 선택
			
			if(menu >= 1 && menu <= 5) {
				System.out.println(menuName + "이 주문되었습니다.");
				count++;
			} else {
				System.out.println("0 ~ 5번 사이의 숫자를 입력해주세요.");
			}
			
		} while (menu != 0);
		System.out.println(count + "개의 주문을 완료합니다.");
		
		sc.close();
	}
}
