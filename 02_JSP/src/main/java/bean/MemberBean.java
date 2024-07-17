package bean;

// 자바 vean

//JSP에 있는 이 데이터의 내용을 자동으로 Java에다가 넣어주기 위해서 이렇게 반드시
//  Get Set을 만들어줘야지만 jsp에 여기에 있는 데이터의 내용이
//java.bins 이 멤버 변수 안에 들어갑니다.

// jsp_에서 데이터를 패키징 클래스에다 집어넣고 그걸 데이터베이스에 편리하게 한꺼번에 클래스 단위로 넘기는 것. 
public class MemberBean {

	// 자바빈의 맴버 변수에 자동으로 데이터가 들어가, 패키징이 되도록 반드시 동일한 name으로 작성해줘야한다.
	// jsp name 과 1:1 대응
	private String id;
	private String password;
	private String email;
	private String tel;
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
