package generics;
// 모든 참조자료형을 사용하고 싶다면, Object를 사용하면 된다. 
// 업캐스팅 되기떄문에 이 자료형에 대한 어떤 결과를 받기위해선 다운캐스팅을 해야한다. -> 
public class TreeDPrinterTest {

	public static void main(String[] args) {

		// Powder 타입 매개변수 (재료) 받아서 TreeDPrinter 객체 생성 
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
	
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		// Plastic 타입 매개변수(재료) 받아서 TreeDPrinter 객체 생성 
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
	
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
		
	}

}
