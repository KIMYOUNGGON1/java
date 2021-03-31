package p04.textbook;

public class ForMultipleicationTableExample2 {
	public static void main(String[] args) {

		// System.out.println("새로운 줄");
//		System.out.println("새로운 줄");
////		자동으로 줄바꿈이 이뤄지는가
//		System.out.print("같은 줄");
//		System.out.print("같은 줄");
//		System.out.println("새로운 줄");
//		

//		*
//		**
//		***
//		****
//		*****
		System.out.println("1번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		System.out.println("2번");
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 강사님 방식
		System.out.println("강사님 방식");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 *****
		  ****
		   ***
		    **
		     *
		 */
		System.out.println("3번");
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++){
				System.out.print(" ");
			}
			for (int j = 0; j < (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		     *
		    **
		   ***
		  ****
		 *****
		 */
		System.out.println("4번");
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < (4-i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
