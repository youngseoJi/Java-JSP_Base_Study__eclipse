package inheritance;

// 상속  : 일반적인 것과 구체적인 클래스의 관계 is - a 관계
public class Circle {

	// 협상 : point 클래스의 점을 활용하고 싶을때 참조변수 갖고오기
	Point point; // has -a 관계
	
	private int x;
	private int y;

	private int radius;

	public Circle() {
		point = new Point();
	}
}
