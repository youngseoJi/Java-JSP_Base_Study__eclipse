package withArraylist;

// VIP 고객 - 상위클래스 고객 클래스의 기능등을 쓰기위해 상속받아 사용함
public class VIPCustomer extends Customer {


	// VIP 고객을 위한 추가 할인 정책 및 담당 상담원 배치
	private int agentID;// 전문 상당원 식별자
	private double saleRatio;// 할인률
	
	// VIP 고객 생성자
	public VIPCustomer(int cutomerID, String customerName, int agentID)
	{
	 // super() : 상속키워드 /  안보이지만 있다.() 비어있으면 디폴트 생성자를 불러온다. 
	  super(cutomerID, customerName);
	  
	  // 상속받은 클래스 변수
 	  customerGrade = "VIP";
	  bonusRatio = 0.05;
	  saleRatio = 0.1;
	  
	  // 현재 클래스의 변수
	  this.agentID = agentID;
	  // System.out.println("VIP");
	}
	
	// VIP 보너스 & 할인률
	// 메서드 오버라이딩 : 동일한 이름 , 매개변수, 반환값을 갖은 메서드를 재정의
		public int calcPrice(int price) {
			bonuspoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		
		}
	
	public int getAgentID() {
		return agentID;
	}
	
	// 재정의
	@Override
	public String showCustomerInfo() {
		// super 상위 클래스 메서드를 호출할 수 있다. 
		return super.showCustomerInfo() + "담당 상담원 ID : " + agentID;
	}
	
}
