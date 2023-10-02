package ch07.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		// ArrayList와 배열 선언
		// 요소 추가
		// 출력
		// ArrayList >> Iterator 변환 출력
		// 문자열 정렬 출력
		// 문자열 역정렬 출력
		// 2번째 위치 삽입
		// 객체 유무 확인
		// ArrayList를 배열로 변환
		// 배열을 ArrayList로 변환
		// 2번째 위치 삭제
		// 전체삭제
		// 빈공간 확인
		// 출력메소드
		
		// ArrayList와 배열 선언
		String[] str = new String[10];
		ArrayList<String> sList = new ArrayList<String>();
		// 요소 추가
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * (100 + 1 - 1) + (1));
			str[i] = new String(num + "홍길동");
			sList.add(new String(num + "홍길동"));
		}
		// 출력

		ArrayPrint(str, sList);
		// ArrayList >> Iterator 변환 출력
		System.out.println("===iterator=====");
		Iterator<String> itr = sList.iterator();
		while (itr.hasNext()) {
			System.out.printf("%s\n", itr.next());
		}
		// 문자열 정렬 출력
		System.out.println("===순서 정렬=====");
		Collections.sort(sList);
		ArrayPrint(str, sList);
		// 문자열 역정렬 출력
		Collections.reverse(sList);
		ArrayPrint(str, sList);
		// 2번째 위치 삽입
		System.out.println("===자료삽입===");
		str[1] = new String("김길동");
		sList.add(1, new String("김길동"));
		ArrayPrint(str, sList);
		// 객체 유무 확인
		String search = "없어요";
		int index = 0;
		String name = new String("김길동");
		for (int i = 0; i < str.length; i++) {
			if (name.equals(str[i])) {
				search = new String("있어요");
				index = i;
				break;
			}
		}
		System.out.printf("배열은 %s %d번째에 %s\n", name, index, search);
		if (sList.contains(name)) {
			System.out.printf("ArrayList는 %s %d번째에 있음\n", name, sList.indexOf(name));

		} else {
			System.out.printf("ArrayList는 %s 없어요\n", name);
		}

		// ArrayList를 배열로 변환
		System.out.println("===");
		Object[] strN = sList.toArray();
		for (Object data : strN) {
			System.out.println(data);
		}
		// 배열을 ArrayList로 변환
		System.out.println("===");
		List<String> list = Arrays.asList(str);
		for (String data : list) {
			System.out.printf("%s\n", data != null ? data : "");
		}
		// 2번째 위치 삭제
		str[1]=null;
		sList.remove(1);
		ArrayPrint(str, sList);
		// 전체삭제
		for(int i=0;i<str.length;i++) {
			str[i]=null;
		}
		sList.clear();
		ArrayPrint(str, sList);
		// 빈공간 확인
		boolean isempty = true;
		for(int i=0;i<str.length;i++) {
			if(str[i]!=null) {
				isempty = false;
				break;
			}
		}
		System.out.printf("%s\n",isempty?"업음":"잇음");
		System.out.printf("%s",sList.isEmpty()?"없음":"있음");
		// 출력메소드
	}

	private static void ArrayPrint(String[] str, ArrayList<String> sList) {
		System.out.printf("배열\tArrayList\n");
		for (int i = 0; i < sList.size(); i++) {
			System.out.printf("%s\t%s\n", str[i], sList.get(i));
		}
	}
}

