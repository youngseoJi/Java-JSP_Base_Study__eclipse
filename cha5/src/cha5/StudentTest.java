package cha5;

public class StudentTest {
   // 클래스를 사용, 실행하는 메서드
	public static void main(String[] args) {
	Student studentJI= new Student();
			studentJI.studentName = "영떠";
			studentJI.address = "서울시 서초구";
			
			// 메서드 실행 (클래스 실행, 사용하기)
			studentJI.showStudentInfor(); // 영떠 , 서울시 서초구

	}

}
