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
		System.out.println(studentName + " , " + address);
	}
}
