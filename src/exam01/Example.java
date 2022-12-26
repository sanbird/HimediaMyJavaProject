package exam01;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2(); 
		}
	}

	public static void main(String[] args) {
		action(new B());
		action(new C());
		
		System.out.println("새로운 내용");
		
		System.out.println("또 새로운 내용");
		System.out.println("또또 새로운 내용");

	}

}
