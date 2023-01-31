package bookshelf;

// 책장 클래스 <- 클래스와 인터페이스 상속
public class BookShelf extends Shelf implements Queue{

	// 구현
	// 책장에 책 추가
	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	// 책장에서 책 꺼내기 (맨 먼저 넣은, 맨 앞에 책부터)
	@Override
	public String deQueue() {
		// 0번쨰 위치하는 책 제거
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

	
}
