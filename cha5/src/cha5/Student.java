package cha5;

// 클래스 생성하기 : 학생
// class(예약어) class명 {} 
public class Student {
	
	// 변수 생성
	int studentID; // 학생 식별자
	String studentName; // 학생이름
	int grade; // 학년
	String address; // 주소
	
	// 메서드 셍성
	public void showStudentInfor() {
		System.out.println(studentName  + " , " + address); 
	}
	
	// 클래스를 사용하기 위한  메인 메서드가 해당 클래스 내에 있을 수 있지만,다른 클래스에서 작동할 수 있다.
/*	// 메인 메서드 (함수) 실행 : 해당 클래스를 실행하기 위한 메서드
	public static void main(String[] args) {
		
		Student studentJI= new Student();
		studentJI.studentName = "영떠";
		studentJI.address = "서울시 서초구";
		
		// 메서드 실행 (클래스 실행, 사용하기)
		studentJI.showStudentInfor();
	}
	*/
	
	
}
