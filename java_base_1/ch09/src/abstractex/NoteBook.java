package abstractex;

// 추상클래스의 추상메서드를 모두 상속받지 않을 경우, 하위클래스도 추상클래스로 해야한다. 
public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook diplay()");			
	}
	
	public void aaa() {
		System.out.println("NoteBook 클래스 타입만 사용가능");
	}
	
}
