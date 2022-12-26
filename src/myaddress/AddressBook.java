package myaddress;

import java.util.Scanner;

public class AddressBook {

	private static Person[] persons = new Person[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {

			showMenu();

			switch (scan.nextInt()) {
			case 1:
				createAddress();
				break;
			case 2:
				showAddress();
				break;
			case 3:
				modify();
				break;
			case 4:
				delete();
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static void showMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.등록 | 2.조회 | 3.수정 | 4.삭제 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택 > ");
	}

	private static void printTitle(String title) {
		System.out.println("----");
		System.out.println(title);
		System.out.println("----");
	}

	private static String getUserInput(String message) {
		System.out.print(message + ": ");
		return scan.next();
	}

	private static void createAddress() {
		printTitle("등록");

		String name = getUserInput("이름");
		String phone = getUserInput("전화번호");
		System.out.print("학생여부(Y/N): ");
		String isStudent = scan.next();

		Person person = null;

		if (isStudent.equals("Y")) {
			System.out.print("학번: ");
			String studentNo = scan.next();

			person = new Student(name, phone, studentNo);
			

		} else {
			System.out.print("사번: ");
			String workerNo = scan.next();

			person = new Worker(name, phone, workerNo);
			
		}

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				persons[i] = person;
				System.out.println("결과: 주소가 생성되었습니다.");
				break;
			}
		}
	}

	private static void showAddress() {
		printTitle("조회");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null) {
//				if (persons[i] instanceof Student) {
//					Student student = (Student) persons[i];
//					student.print();
//				} else if (persons[i] instanceof Worker) {
//					Worker worker = (Worker) persons[i];
//					worker.print();
//
//				}				
				persons[i].print();
			}

		}

	}

	private static void modify() {
		printTitle("수정");

		String name = getUserInput("이름");
		String phone = getUserInput("전화번호");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i].setPhone(phone);
				System.out.println("결과> 정상적으로 수정되었습니다.");
				break;
			}
		}

	}

	private static void delete() {
		printTitle("삭제");

		String name = getUserInput("이름");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] != null && persons[i].getName().equals(name)) {
				persons[i] = null;
				System.out.println("결과> 정상적으로 삭제되었습니다.");

			}

		}
	}

}
