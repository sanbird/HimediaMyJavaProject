package staticfield;

public class A {
	
	int m = 3;
	static int n = 5;
	
	A() {
		System.out.println(m);
		System.out.println(n);
		System.out.println("A() is called");
	}
	
	static {
		n = 50;
		// System.out.println(m);  // m은 인스턴스 변수이므로 사용 불가
		System.out.println(n);
		System.out.println("static block is runned");
	}

	public static void main(String[] args) {
		
		A a = new A();
		
//		A a1 = new A();
//		A a2 = new A();
//		
//		a1.m = 5;
//		a2.m = 6;
//		System.out.println(a1.m); //5
//		System.out.println(a2.m); //6
//		
//		a1.n = 7;   // <== 인스턴스변수명. 정적멤버명 방식의
//		a2.n = 8;   //     사용은 권장사항이 아님
//		System.out.println(a1.n); // 8
//		System.out.println(a2.n); // 8
//		System.out.println(A.n);  // 8
//		
//		A.n = 9;    // <== 클래스명.정적멤버명 방식의 사용을 권장
//		System.out.println(a1.n); // 9
//		System.out.println(a2.n); // 9
//		System.out.println(A.n);  // 9


	}

}
