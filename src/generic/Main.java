package generic;

class A {}
class B extends A {}
class C extends B {}
class D<T extends B> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class Main {

	public static void main(String[] args) {
		D d = new D();   // D<Object> d = new D<Object>();
		
		//D<A> da = new D<A>(); //Bound mismatch
		
		D<B> db = new D<B>();
		D<C> dc = new D<C>();
		// D<D> dd = new D<D>();  // D는 B를 상속하지 않아 불가능

	}

}
