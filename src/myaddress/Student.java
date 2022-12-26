package myaddress;



public class Student extends Person {
	private String studentNo;
	
	
	public Student(String name, String phone, String studentNo) {
		super(name, phone);
		
		this.studentNo = studentNo;
		
	}


	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	public void print() {
		System.out.printf("%s\t%s\t%s\n", super.getName(), super.getPhone(), this.getStudentNo() );	
		
	}

}
