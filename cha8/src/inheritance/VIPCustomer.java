package inheritance;

// VIP 고객 - 상위클래스 고객 클래스의 기능등을 쓰기위해 상속받아 사용함
public class VIPCustomer extends Customer {


	// VIP 고객을 위한 추가 할인 정책 및 담당 상담원 배치
	private int agentID;// 전문 상당원 식별자
	private double saleRatio;// 할인률
	
	// VIP 고객 생성자
	public VIPCustomer(int cutomerID, String customerName)
	{
	 // super() : 상속키워드 /  안보이지만 있다.() 비어있으면 디폴트 생성자를 불러온다. 
	  super(cutomerID, customerName);
 	  customerGrade = "VIP";
	  bonusRatio = 0.05;
	  saleRatio = 0.1;
	  
	  System.out.println("VIP");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
