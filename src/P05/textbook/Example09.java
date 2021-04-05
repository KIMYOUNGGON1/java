package P05.textbook;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				studentNum = 3;
			} else if ( selectNo == 2) {
				scores[0] = 85;
				scores[1] = 95;
				scores[2] = 93;
			} else if (selectNo == 3) {
				scores[0] = 85;
				scores[1] = 95;
				scores[2] = 93;
			} else if (selectNo ==4) {
				for(int i = 0; i < scores.length; i++) {
					studentNum += scores[i];
				}
				System.out.println("최고 점수: " + studentNum);
				System.out.println("평균 점수: " + (double)studentNum/3);
			} else if (selectNo == 5) {
				run =false;
				System.out.println("프로그램종료");
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
