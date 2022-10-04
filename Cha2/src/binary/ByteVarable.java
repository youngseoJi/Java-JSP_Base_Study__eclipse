package binary;

public class ByteVarable {

	public static void main(String[] args) {
		
		byte bData = -128;
		System.out.println(bData);
	
//		byte bData2 = 128; -> byte 범위 넘어서 에러
		byte bData2 = 127; // byte 범위 
		System.out.println(bData2);
	}

}
