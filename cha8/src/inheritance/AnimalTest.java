package inheritance;

// 상위 클래스 
class Animal {
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

// 하위 클래스 3개 
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
}

class Cat extends Animal{
	public void move() {
		System.out.println("고양이가 네발로 통통 뛴다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Cat());
		test.moveAnimal(new Eagle());		
	}
	
	// 메소드 : 매개변수  animal
	public void moveAnimal(Animal animal) {
		animal.move(); // <- 코드 한줄에 대한 결과가 다양하다 . 다향성
	}

}
