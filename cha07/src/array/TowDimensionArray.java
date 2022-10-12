package array;

// 다차원배열
public class TowDimensionArray {

	public static void main(String[] args) {
		// int 자료형의 2행 3열 다차원배열 생성 
		int[][] arr = new int[2][3];
		// 선언과 초기화 동시에
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		System.out.println(arr.length); //2
		System.out.println(arr[0].length); //3
		System.out.println(arr[1].length); //3
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++){
				System.out.println(arr2[i][j]);
				// 1 ~ 6 이중배열 값 모두 출력됨
			}
		}
		 
	}

}
