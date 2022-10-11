package staticex;

public class StydentTest1 {

	public static void main(String[] args) {
		
		// static 메서드 실행 
		// static 변수 : 클래서에서 바로 참조, 인스턴스 생성전 실행가능, 객체 외부에서 사용가능
		System.out.println(Student.getSerialNum()); // 10000
		
		/*
		Student studentYS = new Student();
		System.out.println(studentYS.studentID);	// 10001
	
		Student studentHK = new Student();
		System.out.println(studentHK.studentID); // 10002
		*/
	}

}
