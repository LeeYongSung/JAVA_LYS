package Day08.Ex05_MultiInterface;

import java.util.Scanner;

public class SmartTelevisionEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		System.out.print("SBS, KBS, MBC, Mnet : ");
		String serch = sc.next();
		int channel = tv.channelSerrch(serch);
		tv.setChannel(channel);
		
		System.out.print("영화, 아이돌 : ");
		String serch2 = sc.next();
		String[] idolContent = tv.contentSearch(serch2);
		System.out.println("================== 검색된 컨텐츠 ==================");
		
		for (int i = 0; i < idolContent.length; i++) {
			System.out.print(idolContent[i]);
			if( i <idolContent.length - 1 )
				System.out.print(", ");
		}
		System.out.println();
		
		tv.touch(10, 20);
		
		System.out.print("말해주세요 : ");
		String voice = sc.next();
		tv.receiveVoice(voice);
		
		tv.turnOff();
	}
	
}
