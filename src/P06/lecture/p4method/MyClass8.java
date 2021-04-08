//package P06.lecture.p4method;
//
//import java.util.Arrays;
//
//public class MyClass8 {
//	
//	int max(int... a) {
//		Arrays.sort(a);
//		System.out.println("최대값은 :" + a[a.length - 1]);
//		int M;
//		M = a[a.length -1];
//		
//		return M;
//	}
//}

package P06.lecture.p4method;

public class MyClass8 {

	int max(int... nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		
		return max;
	}

}






