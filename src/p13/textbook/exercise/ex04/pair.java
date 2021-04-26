package p13.textbook.exercise.ex04;

public class pair<K, V> {
	private K key;
	private V value;

	public pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
