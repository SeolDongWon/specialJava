package ch07.sec05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapScoreEx {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// (학생이름, Student)쌍을 갖는 HashMap 생성
		HashMap<String, Student> map = new HashMap<String, Student>();

		// 추가
		map.put("황기태", new Student(1, "010-111-1111"));
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		
		System.out.println("========Set================");
		Set<String> keySet = map.keySet();
		for (String data : keySet) {
			System.out.printf("이름:%s 학번:%s 번호:%s\n", data, map.get(data).getId(), map.get(data).getTel());
		}
		System.out.println("");

		System.out.println("========Iterator================");
		Iterator<String> strIr = map.keySet().iterator();
		while (strIr.hasNext()) {
			String name = strIr.next();
			System.out.printf("이름:%s 학번:%s 번호:%s\n", name, map.get(name).getId(), map.get(name).getTel());
		}

		
		System.out.println("========검색================");
		// 검색
		while (true) {
			System.out.print("검색할 이름?(종료:exit)");
			String name = scan.next().trim();
			name = name.toLowerCase();
			if (name.equals("exit"))
				break;

			Student student = map.get(name);

			if (student == null)
				System.out.printf("%s는 없는 사람입니다.\n", name);
			else
				System.out.printf("id: %s, 전화: %s\n", student.getId(), student.getTel());
		}

		System.out.println("\nEND");

	}
}

class Student {
	private int id;
	private String tel;

	public Student(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}
	
	
}
