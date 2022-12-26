package test;


class A1 {
	int a = 3;
	final int b = 5;
}

class A2 {
	int a;
	final int b;
	A2(){
		this.a = 3;
		this.b = 5;    // 선언만 한 경우는 생성자를 통해 초기화 가능
	}
}

class A3 {
	int a = 3;
	final int b = 5;   // 선언과 할당을 동시에 시행
	A3() {
		this.a = 30;
//		this.b = 50;   // 재할당하는 것이 불가능 하기 때문에 오류 발생
	}
}

public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
