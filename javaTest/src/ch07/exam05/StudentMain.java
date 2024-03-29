package ch07.exam05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();

//		System.out.printf("4명의 학생,이름,학과,학번,학점평균을 입력하시오\n");
//		for (int i = 0; i < 4; i++) {
//			System.out.printf(">>");
//			String[] data = scan.nextLine().trim().split(",");
//			al.add(new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
//		}
		
		al.add(new Student("황기태","모바일",1,3.1));			
		al.add(new Student("이재문","안드로이드",2,3.9));			
		al.add(new Student("김남윤","웹공학",3,3.5));			
		al.add(new Student("최찬미","빅데이터",4,4.25));	
		
		System.out.println("===========정보출력=============");
		Iterator<Student> ir = al.iterator();
		while(ir.hasNext()) {
			System.out.printf("%s \n",ir.next());
		}
		
		System.out.println("===========정보찾기=============");
		
		while(true) {
			System.out.printf("학생이름>>");
			String name = scan.next().trim();	
			if(name.equals("그만"))break;
			
			System.out.printf("학생번호>>");
			int id = Integer.parseInt(scan.next().trim());
			Student findStu = new Student(name,id);
			boolean isfind = al.contains(findStu);
			if(isfind) {
				System.out.printf("%s \n",al.get(al.indexOf(findStu)));
			}else {
				System.out.printf("찾는 학생이 없습니다 \n");				
			}
			
		}
		
		scan.close();
		System.out.println("END");
	}
}
