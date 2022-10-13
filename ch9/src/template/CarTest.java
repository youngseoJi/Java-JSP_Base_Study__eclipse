package template;

public class CarTest {

	public static void main(String[] args) {

		Car humanCar = new ManualCar();
		humanCar.run();
		Car aiCar = new AiCar(); 
		aiCar.run();
	}

}
