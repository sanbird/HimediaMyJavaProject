package exam04;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	private static final int LENGTH_WIN_NUMBERS = 6;

	private int[] winNumbers = new int[6];
	private int[] inputNumbers = new int[6];

	private void winNumbers() {
		while (true) {
			int num = (int) (Math.random() * 45) + 1;

			int i = 0;
			for (i = 0; i < winNumbers.length; i++) {

				if (this.winNumbers[i] == num) {
					break;
				} else if (this.winNumbers[i] == 0) {
					this.winNumbers[i] = num;
					break;
				}
			}

			if (i == winNumbers.length) {
				break;
			}
			Arrays.sort(this.winNumbers);
		}

	}

	private void inputNumbers() {

		System.out.println("1부터 45 사이의 6개의 숫자를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		String[] input = scan.next().split(",");
		scan.close();

		for (int i = 0; i < inputNumbers.length; i++) {
			this.inputNumbers[i] = Integer.parseInt(input[i].trim());
		}
		Arrays.sort(this.inputNumbers);
	}

	private void printNumbers(int[] numbers) {
		for (int number : numbers) {
			System.out.printf("%2s ", number);
		}
		System.out.println();
	}

	private void printWinNumbers() {
		System.out.print("당첨 번호 : ");
		this.printNumbers(this.winNumbers);
	}

	private void printInputNumbers() {
		System.out.print("입력 번호 : ");
		this.printNumbers(this.inputNumbers);
	}

	private void printResult() {
		int count = 0;
		for (int input : inputNumbers) {
			if (Arrays.binarySearch(winNumbers, input) >= 0) {
				System.out.println(input);
				count++;
			}
		}
		String message = "";
		if (count == 6) {
			message = "1등 당첨되었습니다.";
		}
		if (count == 5) {
			message = "2등 당첨되었습니다.";
		}
		if (count == 4) {
			message = "3등 당첨되었습니다.";
		} else {
			message = "낙첨되었습니다.";
		}
		System.out.printf("%d개가 일치하므로 %s", count, message);
	}

	public static void main(String[] args) {

		Lotto lotto = new Lotto();

		lotto.inputNumbers();
		lotto.printInputNumbers();

		lotto.winNumbers();
		lotto.printWinNumbers();

		lotto.printResult();

	}

}
