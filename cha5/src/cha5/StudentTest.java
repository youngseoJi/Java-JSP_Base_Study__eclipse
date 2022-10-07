package cha5;

public class StudentTest {
   // 클래스를 사용, 실행하는 메서드  메인 메서드 생성 - class/객체를 사용하기 위한 함수
	public static void main(String[] args) {
	
		// new 키워드 : (객체 /생성자/인스턴스) 생성하는 키워드 
		// 참조형 데이터 타입 Student - 참조변수 studentJi
		Student studentJi = new Student();
		
		// 참조변수  .을 찍으면 참조 함수 사용가능 
		// 메서드 실행 (클래스 실행, 사용하기)
		studentJi.studentName = "지씨";
		studentJi.studentID = 1;
		studentJi.address = "서울시 도렴동";
		
		Student studentKim = new Student();
		
		studentKim.studentName = "김씨";
		studentKim.studentID = 2;
		studentKim.address = "서울시 봉천동";
		
		studentJi.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentJi);
		System.out.println(studentKim);
	}
			
   // 클래스를 사용하기 위한  메인 메서드가 해당 클래스 내에 있을 수 있지만,다른 클래스에서 작동할 수 있다.
			
}


