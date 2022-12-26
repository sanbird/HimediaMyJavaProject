package mapSample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main01 {
	
	private static Map<String, Integer> fruites = new HashMap<>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("지금까지 먹었던 과일을 입력하세요.");
		String input = scan.nextLine().trim();
		
		String[] fruiteNames = input.split(" ");
		
		System.out.println(Arrays.toString(fruiteNames));
		
		for (String fruiteName : fruiteNames) {
			if (fruites.keySet().contains(fruiteName)) {
				Integer count = fruites.get(fruiteName);
				fruites.put(fruiteName, count + 1);
			} else {
				fruites.put(fruiteName, 1);
			}
		}
		
		System.out.printf("지금까지 먹었던 과일은 총 %d가지 종류이고 각 과일의 섭취 회수는 다음과 같습니다.\n", fruites.size());
		for (String key : fruites.keySet()) {
			System.out.printf("- %s : %d\n", key, fruites.get(key));
		}

	}

}
