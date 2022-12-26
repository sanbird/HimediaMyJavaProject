package polymorphism;

//class A {

//	int m = 10;
//	void abc() {
//		System.out.println("A.abc() is called");
//	}
//}
//
//class B extends A {
//	int n = 20;
//	void bcd() {
//		System.out.println("B.bcd() is called");
//	}
//}
//
//public class InheritanceSample {
//
//	public static void main(String[] args) {
//		B b = new B();
//		
//		System.out.println("B 객체의 n 필드 = " + b.n);
//		b.bcd();
//		
//		System.out.println("A 객체의 m 필드 = " + b.m);
//		b.abc();
//
//	}
//
//}

//class A { }
//
//class B extends A { }
//
//class C extends B { }
//
//class D extends B { } 
//
//
//public class InheritanceSample {
//
//	public static void main(String[] args) {
//
//		A a = new A();
//		B b = new B();
//		C c = new C();
//		D d = new D();
//
//		A ab = new B();
//		A ac = new C();
//		A ad = new D();
//
//		B bc = new C();
//		B bd = new D();
//
//	}
//}

//class Fruit {
//}
//
//class Kiwi extends Fruit {
//}
//
//class GreenKiwi extends Kiwi {
//	
//}
//
//
//public class InheritanceSample {
//
//	public static void main(String[] args) {
//		{
//			Kiwi k1 = new Kiwi();
//			Fruit f1 = k1; // A a1 = (A)b1;
//
//			GreenKiwi g1 = new GreenKiwi();
//			Kiwi k2 = g1; // B b2 = (B)c1;
//			Fruit f2 = g1; // A a2 = (A)c1;
//		}
//		{
//			int i = 10;
//			byte b = (byte)i;
//			
//			Fruit f1 = new Fruit();        // f1 을 Fruit 이라 생성
//			Kiwi k1 = (Kiwi)f1;            // f1이 키위일지 아닐지 몰라서 변환 불가
//			GreenKiwi g1 = (GreenKiwi)f1;  // 불가능하다
//			
//			Fruit f2 = new Kiwi();
//			Kiwi k2 = (Kiwi)f2;            // f2가 키위이기 때문에 변환 가능
//		}
//
//	}
//}
//

//class A {
//	int m = 3;
//	void abc() {
//		System.out.println("A");
//	}
//}
//
//class B extends A {
//	int n = 4;
//	void bcd() {
//		System.out.println("B");
//	}
//}
//
//public class InheritanceSample {
//
//	public static void main(String[] args) {
//		B b = new B();
//		System.out.println(b.m);
//		System.out.println(b.n);
//		b.abc();
//		
//	}
//}
//
class A { 
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class B extends A { 
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

public class InheritanceSample {
	public static void main(String[] args) {
		
		A a = new A();
		a.print1();
		a.print2();
		
		B b = new B();
		b.print1();
		b.print2();
		b.print2(100);
		
		A c = new B();
		c.print1();  // 오버라이딩 된 메서드
		c.print2();  // int a 가 들어간 print2 만 재정의되고 오버라이딩
		             // 되지 않았기 때문에 A 의 print2 가 호출
		
		
	}
}