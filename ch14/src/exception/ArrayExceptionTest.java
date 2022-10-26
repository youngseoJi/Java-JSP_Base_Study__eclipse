package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		// try : 실행 할 코드  오류없을 시 끝까지 실행, 오류발생시 catch {}로 넘김
		try {
			for(int i=0; i <=5; i++) {
				System.out.println(arr[i]);
			}
		}
		// catch : 오류발생시 실행 할 코드
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // 인셉션의 이름과, 에러가 난 부분을 알려줌 e.toString()
		
		//finally 구문 다음에 return 실행 
		//return;
		}
		// finally : try가 실행되면 함꼐 실행됨(오류가 있든말든, 인셉션이 발생하든 말든 무조건 실행), 먼마지막 정리 할떄 실행규뮨
		finally {
			System.out.println("finally");
			
		}
		System.out.println("end");
	} 


}
