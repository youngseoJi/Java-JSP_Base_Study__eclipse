package staticex;

public class Student {
	
	// 데이터 영역 
	// private : 인스턴스, 객체 밖에서는 수정 못하게 
	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	// 학생이 증가될때마다 컨스트럭털 실행
	public Student() {
		// 증가,실행될때마다 1씩 증가
		serialNum++;
		// serialNum을 복사해서 
		// -> 각각의 인스턴스(각 학생 id)에 담아준다.
		studentID = serialNum;
	}
	
    /* 기준이 되는 값은 static 변수로 생성하여 유지 
     * 여러 인스턴스가 하나의 메모리값을 공유할 때 필요 
     * static 메서드 : 인스턴스 변수를 사용할 수 없다.  
     * 이유 : 인스턴스 변수는 꼭 인스턴스가 먼저 생성되어야 하므로, static - 인스턴스 생성이 북활실하기에 사용 X*/
	 

	
	public static int getSerialNum() {
		
		// 지역변수 : 메서드가 실행될때 생성 -> 종료되면 삭제
		int i = 10; 
		i++;
		System.out.println(i);
		
		// 멤버변수, 인스턴스 변수  - static 메서드에서는 , 인스턴스 변수를 사용할 수 없다.
		// studentName = "홍길동";
		
		// static 변수, 클래스 변수
		return serialNum;
	}
	
}
