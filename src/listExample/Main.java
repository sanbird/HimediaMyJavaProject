package listExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private String name;
	private int korean;
	private int english;
	private int math;

	public Student(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}

public class Main {

	private static List<Student> students = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		students.add(new Student("홍길동", 100, 20, 80));
//		students.add(new Student("고길동", 80, 40, 90));
//		students.add(new Student("신길동", 80, 60, 60));
//		
//		for (Student std : students) {
//			System.out.printf("%s\t%d\t%d\t%d\n", 
//					std.getName(),
//					std.getKorean(),
//					std.getEnglish(),
//					std.getMath());
//		}

		boolean isRun = true;
		while (isRun) {

			System.out.println("------------------------------------------");
			System.out.println("1.등록 | 2.국어 | 3.영어 | 4.수학 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 > ");



			switch (Integer.parseInt(scan.nextLine().trim())) {
			case 1: {
				System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
				while (true) {
					String s = scan.nextLine().trim();
//					System.out.println(">" + s + "<");
					if (s.equals("q") || s.equals("Q")) {
						break;
					}

					String[] input = s.split(",");
					Student student = new Student(input[0].trim(), Integer.parseInt(input[1].trim()),
							Integer.parseInt(input[2].trim()), Integer.parseInt(input[3].trim()));
					students.add(student);
				}
			}

				break;
			case 2: {
				double sum = 0;
				for (Student std : students) {
					System.out.printf("%s\t%d점\n", std.getName(), std.getKorean());
					sum = sum + std.getKorean();
				}
				double avr = sum / students.size();
				avr = (double) Math.round(avr * 10) / 10;
				System.out.printf("총점 : %4.0f점\n", sum);
				System.out.printf("평균 : %4.1f점\n", avr);
			}

				break;
			case 3: {
				double sum = 0;
				for (Student std : students) {
					System.out.printf("%s\t%d점\n", std.getName(), std.getEnglish());
					sum = sum + std.getEnglish();
				}
				double avr = sum / students.size();

				avr = (double) Math.round(avr * 10) / 10;
				System.out.printf("총점 : %4.0f점\n", sum);
				System.out.printf("평균 : %4.1f점\n", avr);
			}
				break;
			case 4: {
				double sum = 0;
				for (Student std : students) {
					System.out.printf("%s\t%d점\n", std.getName(), std.getMath());
					sum = sum + std.getMath();
				}
				double avr = (double) sum / students.size();
				avr = Math.round(avr * 10) / 10;
				System.out.printf("총점 : %4.0f점\n", sum);
				System.out.printf("평균 : %4.1f점\n", avr);
			}
				break;
			case 5:
				isRun = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
