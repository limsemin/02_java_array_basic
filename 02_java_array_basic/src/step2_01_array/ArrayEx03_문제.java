
package step2_01_array;

/*2021-03-30
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]% 4==0) {
				System.out.print(arr[i]+ " ");
			}
		} 
		System.out.println("\n");
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			if(arr[i]% 4 == 0) {
				sum += arr[i];
			}
		}
		System.out.print(sum + " ");
		System.out.println("\n");
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		sum = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i]% 4 == 0) {
				sum++;
			}
		}
		System.out.println(sum + "\n");	
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		int even = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]% 2 == 0){
				even++;
			}
		}
		System.out.println(even + "\n");
	}
	
}
