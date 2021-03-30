package step2_01_array;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 temp 배열을 생성한뒤에 
 *   arr배열의 요소들을 temp로 옮겨담자.
 * 
 * 
 */

public class ArrayEx13_정답예시 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int cnt = 0;
		int cntInLoop = 0;
		
		for (int i=0; i<5; i++) {
			if ( arr[i] % 4 == 0 ) {
				cnt++;
			}
		}		
		temp = new int[cnt];
		
		for (int i=0; i<5; i++) {
			if ( arr[i] % 4 == 0 ) {
				temp[cntInLoop] = arr[i];
				cntInLoop++;
			}
		}
		
		for (int i=0; i<cnt; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
	}
	
}
