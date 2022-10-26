package exception;

public class IDFormatTest {

	private String userID;
	
	// 유저아이디 조회
	private String getUserID() {
		return userID;
	}

	// 유저아이디 설정
	// throws - 실제 사용하는 곳에서 에러 헨들링을 미루기 
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID == null) {
			// throw - 에러발생 
			throw new IDFormatException("아이디를 작성해주세요.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디를 8글자 이상 20글자 이하로 작성해주세요.");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		
		// 에러 핸들링, throws 미룬
		IDFormatTest idTest = new IDFormatTest();
		String userID = null;
		
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
			// exception.IDFormatException: 아이디를 작성해주세요. -> 이셉션 명, 에러메세지 출력
		}
		

		userID = "1234567";
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
			//exception.IDFormatException: 아이디를 8글자 이상 20글자 이하로 작성해주세요.
		}
	}

}
