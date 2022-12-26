package mapSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Fruite {
	private String name;
	private int count;
	
	
	public Fruite(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

public class Main {
	
	private static List<Fruite> fruites = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		System.out.println("지금까지 먹었던 과일을 입력하세요.");
		String input = scan.nextLine().trim();
		
		String[] values = input.split(" ");
		
		System.out.println(Arrays.toString(values));
		
		for (String value : values) {
			boolean isRegisted = false;
			for (Fruite fruite : fruites) {
				if(value.equals(fruite.getName())) {					
					fruite.setCount(fruite.getCount() + 1);
					isRegisted = true;
					break;
				}
			}
			if (!isRegisted) {
				fruites.add(new Fruite(value,1));
			}
		}
		System.out.printf("지금까지 먹었던 과일은 총 %d가지 종류이고 각 과일의 섭취 회수는 다음과 같습니다.\n", fruites.size());
		for (Fruite fruite : fruites) {
			System.out.printf("- %s : %d\n", fruite.getName(), fruite.getCount());
		}
		
		

	}

}
