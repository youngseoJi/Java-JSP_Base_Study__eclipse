package array;

public class ArrayTEst {

	public static void main(String[] args) {
		
		// 배열 생성 : 자료형[] 배열변수이름 = new 자료형[개수]
		int[] num1 = new int[3]; // or int numbers[] = new int[3];
		// 데이터 삽입
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		
		for (int i = 0; i <num1.length; i++) {
			System.out.println(num1[i]); // 1 2 3
		}
		
		// 배열 초기화 : [] 내에 배열 값 개수 적지 않을경우, {}로 배열의 크기 지정
		// {} 안의 값이 생성이되고 그것이 초기화 된것  
		// 초기화 되는 만큼, 메모리가 잡힌다. (메모리 크기)
		int[] num2 = new int[] {0,1,2};
		
		System.out.println(num2.length); // 3
		 
		// 배열 초기화 : [] 배열안에 배열 크기/개수 지정하여 초기화 
		int[] num3 = new int[5];
		System.out.println(num3.length); // 5
		
		// 초기화되어서 값은 0, 배열의 변수개수는 초기화한 크기 5개
		for (int i = 0; i <num3.length; i++) {
			System.out.println(num3[i]); // 0 0 0 0 0
		}
	}

}
