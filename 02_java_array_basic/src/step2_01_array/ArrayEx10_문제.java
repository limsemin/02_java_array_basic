package step2_01_array;


import java.util.Scanner;

/*//20210320
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 777 당첨
 * 1
 */


public class ArrayEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		
		while (true) {	
			boolean isRun = false;
			int count = 0;
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			if(sel == 1) {
				for(int i =0; i<8; i++) {
					if(lotto1[i] == 7) {
						count++;
						if(count == 3) isRun=true;	
						}else {
							count=0;							
						}
					}
				}
			else if(sel == 2) {
				 for(int i = 0; i<8; i++) {
					 if(lotto2[i] == 7) {
						 count++;
						 if(count == 3) isRun =true;
					 	}else {
					 		count=0;
					 	}
				 	}
			 	}		
			else if(sel ==3) {
				for(int i = 0; i< 8; i++) {
					if(lotto3[i] == 7) {
						count++;
							if(count ==3)isRun=true;
						}else {
							count=0;
						}
					}
				}
			else if(sel == 0) break;
			else continue;
			
			if(isRun) 
				System.out.println("당첨");				
			else 
				System.out.println("꽝");		
			}
			scan.close();
		}
 	}
 	
	