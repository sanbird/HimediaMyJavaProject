package otherpackage;

import mypackage.MyClass;

public class MyOtherClass extends MyClass {
	
	// 부모 클래스(MyClass)가 가지고 있는 멤버에 대한 접근을 확인
	void accessMyClassMember() {
		// privateInt = 10;
		// packageInt = 10;
		protectedInt = 10; // MyClass를 상속 받았기 때문에 사용 가능
		publicInt = 10;
		
		// privateMethod();
		// packageMethod();
		protectedMethod();
		publicMethod();
	}

	public static void main(String[] args) {
		
		// 상속 받은 상태가 아닌 MyClass 자체를 
		// 불러왔기 때문에 protected가 먹히지 않음
		MyClass mc = new MyClass();
		
		// mc.protectedInt = 10;
		mc.publicInt = 10;
		
		// 상속 받은 MyOtherClass를 사용하기때문에
		// protected 가 사용 가능
		MyOtherClass moc = new MyOtherClass();
		
		moc.protectedInt = 10;
		moc.publicInt = 10;

	}

}
