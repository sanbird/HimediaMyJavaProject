package exam03;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35 );
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
	}
}

class Util {
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if (p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
	
	
}

class Pair<K, V> {
	private K key;
	private V value;
	
	Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() { return key; }
	V getValue() { return value; }
}

class ChildPair<K, V> extends Pair<K, V>{
	ChildPair(K k, V v) { 
		super(k, v);
	}
}

class OtherPair<K, V> {
	private K key;
	private V value;
	
	OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	K getKey() { return key; }
	V getValue() { return value; }
}
