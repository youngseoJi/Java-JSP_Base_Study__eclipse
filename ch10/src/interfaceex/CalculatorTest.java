package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		
		// 타입 업캐스팅
		Calc calc1 = new CompleteCalc();
		CompleteCalc calc2 = new CompleteCalc();
		Calculator calc3 = new CompleteCalc();
		
//		 System.out.println(/calc1.add(num1, num2)); // 13 
		// 디폴트 메서드 test
		calc1.description();
		
		// static 메서드 test
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum); //15
		
	}

}
