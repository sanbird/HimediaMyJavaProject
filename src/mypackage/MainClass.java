package mypackage;

public class MainClass {
	
	public static void main(String[] args) {
		
		// Myclass의 인스턴스를 생성한 후 필드와 메서드에 접근
		MyClass mc = new MyClass();
		
		mc.packageInt = 10;
		mc.protectedInt = 10;
		mc.publicInt = 10;
		
		mc.packageMethod();
		mc.protectedMethod();
		mc.publicMethod();
	}

}
