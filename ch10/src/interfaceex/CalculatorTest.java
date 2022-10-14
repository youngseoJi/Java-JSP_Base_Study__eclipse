package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		// 타입 업캐스팅
		Calc calc1 = new CompleteCalc();
		CompleteCalc calc2 = new CompleteCalc();
		Calculator calc3 = new CompleteCalc();
		
		 System.out.println(calc1.add(num1, num2)); // 13 
	}

}
