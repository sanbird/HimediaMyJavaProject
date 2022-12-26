package otherpackage;

import mypackage.MyClass;

public class OtherClass {
	public static void main(String[] args) {

		// Myclass의 인스턴스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();

		// mc.packageInt = 10;    // 패키지가 다르기 때문에 접근 불가
		// mc.protectedInt = 10;  // 상속 관계가 없어서 접근 불가
		mc.publicInt = 10;

		// mc.packageMethod();    // 패키지가 다르기 때문에 접근 불가
		// mc.protectedMethod();  // 상속 관계가 없어서 접근 불가
		mc.publicMethod();
	}

}
