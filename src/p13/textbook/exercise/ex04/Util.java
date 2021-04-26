package p13.textbook.exercise.ex04;

import p13.textbook.s130402.Pair;

public class Util {

	public static <K, V> V getValue(pair<Integer, String> pair2, int i) {
		K Key = pair2.getKey();
		
		if(Key.equals(i)) {
			return pair2.getValue();
		}
		return null;
	}
	
}
