package Day08.Ex05_MultiInterface;

// 인터페이스 다중 상속
// public interfave 인터페이스명 extend 인터페이스A, 인터페이스B ... { }
public interface SmartRemoteControl extends RemoteControl, Microphone{

	// 터치패드 기능
	// - x, y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
	
	
}
