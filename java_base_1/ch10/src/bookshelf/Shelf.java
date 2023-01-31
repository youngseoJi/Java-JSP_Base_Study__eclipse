package bookshelf;

import java.util.ArrayList;

public class Shelf {
	
    // protected : 상속받을 곳에서 쓸 수 있음, 배열 선언 
	protected ArrayList<String> shelf;
	
	// 디폴트 생성자
	public Shelf() {
		// shelf 배열  인스턴스 생성
		shelf = new ArrayList<String>();
	}
	
	// get 메서드 생성
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}

}
