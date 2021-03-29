package step2_01_array;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		//배열 사용 예시 1.
		String[] test1 = new String[3];
		double[] test2 = new double[3];
		boolean[] test3 = new boolean[10];
		char[] test4 = new char[1];
		//--------------------------------앞과 뒤가 같다.
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2]	= 30;
		
		//배열 사용예시2
		int[] arr2 = {10,20,30,40,50};
		
		//배열 사용예시3(for문과 조합) 이렇게도 할 수 있다 !
		int[] arr3 = new int[3];
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = (i + 1) * 10;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
