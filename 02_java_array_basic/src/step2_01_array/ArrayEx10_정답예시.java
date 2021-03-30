package step2_01_array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

public class ArrayEx10_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1   = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2   = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3   = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel        = 0;
		
		while (true) {
			
			boolean isWin = false;
			int cnt       = 0;
			
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
								
			if ( sel == 1 ) {
				for (int i=0; i<8; i++) {
					if (lotto1[i] == 7) {
						cnt++;
						if (cnt == 3) isWin = true;
					} 
					else {
						cnt = 0;
					}
				}
			}
			else if ( sel == 2 ) {
				for (int i=0; i<8; i++) {
					if (lotto2[i] == 7) {
						cnt++;
						if (cnt == 3) isWin = true;
					} 
					else {
						cnt = 0;
					}
				}
			}
			else if ( sel == 3 ) {
				for (int i=0; i<8; i++) {
					if (lotto3[i] == 7) {
						cnt++;
						if (cnt == 3) isWin = true;
					} 
					else {
						cnt = 0;
					}
				}
			}
			else if ( sel == 0 ) break;
			else                 continue;		
			
			
			if (isWin) 		System.out.println("\n당첨");
			else 			System.out.println("\n꽝");
			
		}
		
		scan.close();
		
	}
}


// 참고) 배열의 주소값 대입
//public class ArrayEx10_정답 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[] lotto1   = {0, 0, 7, 7, 7, 0, 0, 0};
//		int[] lotto2   = {7, 0, 7, 7, 0, 0, 0, 0};
//		int[] lotto3   = {7, 0, 7, 7, 7, 0, 7, 0};
//		int[] target   = new int [7];
//		int sel        = 0;
//		
//		while (true) {
//			
//			boolean isWin = false;
//			int cnt       = 0;
//			
//			System.out.println("\n[1]번복권 결과확인");
//			System.out.println("[2]번복권 결과확인");
//			System.out.println("[3]번복권 결과확인");
//			System.out.println("[0]종료");
//			System.out.print("메뉴 선택 : ");
//			sel = scan.nextInt();
//								
//			if      ( sel == 1 ) target = lotto1;	// 배열의 주소 대입
//			else if ( sel == 2 ) target = lotto2;
//			else if ( sel == 3 ) target = lotto3;
//			else if ( sel == 0 ) break;
//			else                 continue;
//			
//			for (int i=0; i<8; i++) {
//				if (target[i] == 7) {
//					cnt++;
//					if (cnt == 3) isWin = true;
//				} 
//				else {
//					cnt = 0;
//				}
//			}
//			
//			if (isWin) 		System.out.println("\n당첨");
//			else 			System.out.println("\n꽝");
//			
//		}
//		
//		scan.close();
//		
//	}
//}



