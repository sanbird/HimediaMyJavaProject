package exam03;

//class Apple {}
//class Pencil {}
//
//class Goods {
//	private Object goods = new Object();
//	
//	public Object getGoods() {
//		return goods;
//		
//	}
//	
//	public void setGoods(Object goods) {
//		this.goods = goods;
//	}
//}
//
//public class Main01 {
//	public static void main(String[] args) {
//		Goods goods = new Goods();
//		goods.setGoods(new Apple());
//		
//		Apple apple = (Apple) goods.getGoods();
//		
//		// 약한 타입체크(week type checking)을 하기 때문에 자바가 잡지 못함
//		// -> 실행 시점에 문제를 확인 가능
//		Pencil pencil = (Pencil) goods.getGoods();
//	}
//
//}

class Apple {}
class Pencil {}

class Goods<T> {
	private T goods;
	
	public T getGoods() {
		return goods;
		
	}
	
	public void setGoods(T goods) {
		this.goods = goods;
	}
}

public class Main01 {
	public static void main(String[] args) {
		Goods<Apple> goods = new Goods<Apple>();
		goods.setGoods(new Apple());
		
		Apple apple = goods.getGoods();  // 다운캐스팅 하지 않고 사용 가능
		
		// goods가 Apple 이라는걸 알기때문에 컴파일 단계에서 오류 체크 가능
		// Pencil pencil = goods.getGoods();
		
		Goods goods2 = new Goods(); // Object 로 타입이 설정
		goods2.setGoods(new Apple());
		Apple apple2 = (Apple) goods2.getGoods();
	
	}

}
