package Day07.Ex01_shape;

public class Point {

	int x, y;
	

	// 기본 생성자
	public Point() {
		this(0, 0);
	}
	
	// 매개변수가 있는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
