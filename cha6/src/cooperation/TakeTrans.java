package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		// 학생 클래스  = new 학생 인스턴스 객체 생성 (이름 : mh, 갖고있는 돈 5000원)
		Student mh = new Student("mh", 5000);
		Student ys = new Student("ys", 10000);
		
		// 버스 클래스 = new 버스 인스턴스 객체 생성 (100번 번호를갖은 버스)
		Bus bus100 = new Bus(100);
		
		mh.takeBus(bus100);
		ys.takeBus(bus100);
		mh.showInfo();
		ys.showInfo();
		bus100.showInfo();
		
		// 지하철 클래스 = new 지하철 인스턴스/객체 생성 (2호선)
		Subway subwayGreen = new Subway(2);
		ys.takeSubway(subwayGreen);
		ys.showInfo();
		subwayGreen.showInfo();
	}

}
