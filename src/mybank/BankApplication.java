package mybank;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accounts = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		boolean isRun = true;
		while (isRun) {

			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택> ");

			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				showAccounts();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				isRun = false;
				
				break;

			}

		}
		System.out.println("잘못된 입력입니다.");
	}

	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = scan.next();
		System.out.print("계좌주: ");
		String name = scan.next();
		System.out.print("초기입금액: ");
		int amount = scan.nextInt();

		Account account = new Account();
		account.setAccountNo(accountNo);
		account.setName(name);
		account.setBalance(amount);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void showAccounts() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (Account account : accounts) {
			if (account != null) {
				System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getName(), account.getBalance());
			}

		}

	}

	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = scan.next();
		System.out.print("예금액: ");
		int amount = scan.nextInt();

		for (Account account : accounts) {
			if (account != null) {
				account.setBalance(account.getBalance() + amount);
				System.out.println("결과: 예금이 성공되었습니다.");

			}
		}
	}

	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String accountNo = scan.next();
		System.out.print("출금액: ");
		int amount = scan.nextInt();

		for (Account account : accounts) {
			if (account != null) {
				account.setBalance(account.getBalance() - amount);
				System.out.println("결과: 출금이 성공되었습니다.");

			}
		}
	}

}
