package exam03;


//class Container<T> {
//	private T t;
//
//	public T get() {
//		return t;
//	}
//
//	public void set(T t) {
//		this.t = t;
//	}
//	
//	public <T extends String> void method1(T t) {
//		
//	}
//	
//    public <T extends Integer> void method2(T t) {
//		
//	}
//
//	
//	
//}
//
//public class ContainerExample {
//
//	public static void main(String[] args) {
//		Container<String> container1 = new Container<String>();
//		container1.set("홍길동");
//		String str = container1.get();
//		
//		Container<Integer> container2 = new Container<Integer>();
//		container2.set(6);
//		int value = container2.get();
//		
//	}
//
//}

class Container <K,V> {
	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}
	
}

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
	
}