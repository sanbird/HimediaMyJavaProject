package myaddress;

public class Worker extends Person {
	String workerNo;

	public Worker(String name, String phone, String workerNo) {
		super(name, phone);

		this.workerNo = workerNo;
	}

	public String getWorkerNo() {
		return workerNo;
	}

	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", super.getName(), super.getPhone(), this.getWorkerNo());

	}

}
