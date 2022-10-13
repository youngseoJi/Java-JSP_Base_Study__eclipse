package withArraylist;

public class GoldCustomer extends Customer{

	double saleRatio;
	
	// 골드 등급 고객 생성자 : 포인트 적립률 및 세일률 책정
	public GoldCustomer (int cutomerID, String cutomerName) {
		
		super(cutomerID, cutomerName);
		customerGrade = "Gold";
		bonusRatio = 0.2;
		saleRatio = 0.1;
	}

	// 재정의
	@Override
	public int calcPrice(int price) {
		// 적립포인트
		bonuspoint += price * bonusRatio;
		// 할일된 가격 출력
		return price - (int)(price * saleRatio);
	}
	
	
}
