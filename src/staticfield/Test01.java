package staticfield;

public class Test01 {

	final int CONST_NUM_TEN;
	static final int CONST_NUM_NINE;

	void changeFinal() {

	}

	Test01() {
		CONST_NUM_TEN = 10;
		// CONST_NUM_NINE = 9;
	}

	static {
		// CONST_NUM_TEN = 10;
		CONST_NUM_NINE = 9;

	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println(t.CONST_NUM_TEN);
		
		System.out.println(Test01.CONST_NUM_NINE);
	}

}
