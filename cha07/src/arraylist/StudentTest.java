package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		// 학생 생성 : id, 이름 
		Student studentJi  = new Student(1, "Ji");
		// 학생이 듣는 과목 추가 : 과목, 점수
		studentJi.addSubject("영어", 80);
		studentJi.addSubject("수학", 40);
		
		// 학생정보 조회
		studentJi.showStudentInfo();
		
		System.out.println("=============학생구분===");
		Student studentBe  = new Student(2, "Be");

		studentBe.addSubject("영어", 40);
		studentBe.addSubject("수학", 100);
		studentBe.addSubject("사회", 70);
		
		studentBe.showStudentInfo();
	}

}
