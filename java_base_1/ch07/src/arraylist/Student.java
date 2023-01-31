package arraylist;

import java.util.ArrayList;

// 학생 클래스
public class Student {

	private int stID; // 식별자
	private String stName; // 이름
	private ArrayList<Subject> subList; // 학생이 듣는 과목들 - 배열

	// 학생 생성 함수 - 필수 매개변수  식별자, 이름
	public Student(int stID, String stName) {
		// this -> Student 클래스 가리킴
		this.stID = stID;
		this.stName = stName;
		
		// ArrayList 생성 - Subject 주소를 갖고있다.
		subList = new ArrayList<Subject>();
	}
	
	// 수강죽인 과목 추가 함수 - 필수 매개변수 이름, 점수
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		// subject ArrayList 배열에 과목을 추가
		subList.add(subject);
	}
	
	// 수강한 과목 성적 총점 함수 - 필수 매개변수 
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subList) {
			//  특정 학생의 총점 구하기  - 각 과목점수 반복문 끝날때까지 더해주기
			total += subject.getScorePoint();
			// 각 과목 점수
			System.out.println("학생 " + stName + "의" + subject.getName() + "과목 성적은" + subject.getScorePoint() + "입니다.");
		}
		// 총점 
		System.out.println("학생" + stName + "의 총점은 " + total + "입니다.");
		
	}
}
