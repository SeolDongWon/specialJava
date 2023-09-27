package ch07.exam07seol;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exam07Main {
	public static Scanner scan = new Scanner(System.in);
	public static final int NUMBER = 5;
	public static void main(String[] args) {
		
		HashMap<String,Student> hsMap = new HashMap<String,Student>();
		System.out.println("미래장학금관리시스템입니다.");
		
//		for(int i=0;i<NUMBER;i++) {
//		System.out.print("이름과 학점(띄어쓰기로 구분)>> ");
//		String[] input = scan.nextLine().trim().split(" ");
//		hsMap.put(input[0], new Student(input[0],Double.parseDouble(input[1])));
//		}
		
		hsMap.put("적당히", new Student("적당히",3.1));
		hsMap.put("나탈락", new Student("나탈락",2.4));
		hsMap.put("최고조", new Student("최고조",4.3));
		hsMap.put("상당히", new Student("상당히",3.9));
		hsMap.put("고득점", new Student("고득점",4.0));
		
		
		System.out.println("장학생 선발 학점 기준 입력>> ");
		double minScore = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		Set<String> keySet= hsMap.keySet();
		
//		for(String key:keySet) {
//			if(hsMap.get(key).getScore()>=minScore) {
//				System.out.printf("%s ",hsMap.get(key).getName());				
//			}
//		}
		
		for(String data:keySet) {
			Student stu = hsMap.get(data);
			if(stu.getScore()>=minScore) {
				System.out.printf("%s ",stu.getName());				
			}
		}
	}
}
