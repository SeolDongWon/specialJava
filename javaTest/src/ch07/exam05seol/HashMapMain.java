package ch07.exam05seol;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Student> hsMap = new HashMap<String, Student>();
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.콤마(,)로 구분");

		for (int i = 0; i < 4; i++) {
			System.out.printf(">>");
			String str = scan.nextLine();
			String[] sArray = str.split(",");
			String name = sArray[0].trim();
			String dep = sArray[1].trim();
			String id = sArray[2].trim();
			double score = Double.parseDouble(sArray[3].trim());			
			hsMap.put(name, new Student(name,dep,id,score));			
		}

//		hsMap.put("황기태", new Student("황기태","모바일", "1", 3.1));
//		hsMap.put("이재문", new Student("이재문","안드로이드", "2", 3.9));

		System.out.println("\n---------------------------------");
		Set<String> keyset = hsMap.keySet();
		for (String key : keyset) {
			System.out.printf("%s", hsMap.get(key).toString());
			System.out.println("---------------------------------");
		}

		for (; true;) {
			System.out.printf("학생이름>>");
			String search = scan.next().trim();
			if (search.equals("그만"))
				break;
			if (hsMap.get(search) != null) {
				System.out.printf("%s, %s, %s, %s \n", search, hsMap.get(search).getDep(), hsMap.get(search).getId(),
						hsMap.get(search).getScore());
			} else {
				System.out.printf("%s, %s \n", search, "정보없음");
			}
		}
		System.out.print("\nEND");

	}
}
