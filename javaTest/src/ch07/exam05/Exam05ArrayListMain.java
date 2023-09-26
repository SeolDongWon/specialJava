package ch07.exam05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam05ArrayListMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.콤마(,)로 구분");

//		for (int i = 0; i < 2; i++) {
//			System.out.printf(">>");
//			String str = scan.nextLine();
//			String[] sArray = str.split(",");
//			stuList.add(new Student(sArray[0].trim(), sArray[1].trim(), Integer.parseInt(sArray[2].trim()),
//					Double.parseDouble(sArray[3].trim())));			
//		}
		stuList.add(new Student("황기태","모바일",1,3.1));			
		stuList.add(new Student("이재문","안드로이드",2,3.9));			
	
		System.out.println("\n---------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.printf(stuList.get(i).toString());
			System.out.println("---------------------------------");
		}

		
		
		
		for (; true;) {
			System.out.printf("학생이름>>");
			String name = scan.next().trim();
			if (name.equals("그만"))
				break;
		//	if(name.equals(stuList)
		//	stuList.
					
			//stuList.
			boolean falg = stuList.contains(name);
			int index = stuList.indexOf(name);
			System.out.printf("%s\n", (index != -1) ? stuList.get(index) : "없음");
		}

		System.out.print("\nEND");
	}
}
