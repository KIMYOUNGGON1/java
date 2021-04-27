package p13.textbook.exercise.ex04;

public class Util {

	public static <K, V> V getValue(pair<K, V> pair, K string) {
		K key = pair.getKey();
		
		if (key.equals(string)) {
			return pair.getValue();
		}
		
		return null;
	}

	public static <K, V>V getValue(ChildPair<K, V> childPair, K string) {
		K key = childPair.getKey();
		
		if (key.equals(string)) {
			return.childPair.getValue();
		}
		return null;
	}
	
}
