package exception;

public class AutoCloseTest {

	public static void main(String[] args) {

		try (AutoCloseObj obj = new AutoCloseObj()){
			// throw : 예러를 발생하는 키워드, 이셉션 이슈 발생 -> catch로 들어감 
			throw new Exception();
		}catch(Exception e) {
			System.out.println("eception");
		}
		
	}
}