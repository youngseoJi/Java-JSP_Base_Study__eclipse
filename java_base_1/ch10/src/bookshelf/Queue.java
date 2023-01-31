package bookshelf;

// 자료구조
// 큐 : 선입선출, 먼저 들어온 것이 먼저 나간다.
public interface Queue {
	
	// 선언, 정의
	void enQueue(String title); // 책 제목 추가, 책장에 책 꽂기 
	String deQueue(); // 책의 제목 반환, 책장에서 책 꺼내기 (맨 먼저 넣은, 맨 앞에 책부터)
	int getSize(); // 책장의 책의 총  개수
}
