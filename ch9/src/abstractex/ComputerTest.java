package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

		// 추상클래스는 인슼턴스화 X : 수행되야할 메서드가 없기 떄문
		// Computer c1 = new computer();
		 Computer c2 = new DeskTop();		
		// Computer c3 = new NoteBook();		
		 Computer c4 = new MyNoteBook();		
		 NoteBook c5 = new MyNoteBook();		
		 
		 c2.display();
		 c4.display();
		 c5.display();
		 c5.aaa();
	}

}
