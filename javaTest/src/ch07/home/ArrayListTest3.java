package ch07.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {
		// ArrayList와 배열 선언
		String[] sArray = new String[10];
		ArrayList<String> aList = new ArrayList();
		// 요소 추가
		for(int i=0;i<5;i++) {
			sArray[i]=new String((int)(Math.random()*100+1)+"설동원");
			aList.add(new String((int)(Math.random()*100+1)+"설동원"));
		}
		// 출력
		print(sArray,aList);
		// ArrayList >> Iterator 변환 출력
		Iterator<String> itr = aList.iterator();
		while(itr.hasNext()) {
			System.out.printf("%s \n",itr.next());
		}
		System.out.println("============");
		// 문자열 정렬 출력
		Collections.sort(aList);
		print(sArray, aList);
		// 문자열 역정렬 출력
		Collections.reverse(aList);
		print(sArray, aList);
		// 2번째 위치 삽입
		sArray[1]= "00홍길동";
		aList.add(1, "00홍길동");
		print(sArray, aList);
		// 객체 유무 확인
		System.out.printf("%s\n",aList.contains("00홍길동")?"ok":"no");
		// ArrayList를 배열로 변환
		Object[] obj = aList.toArray();
		for(Object data:obj) {
			System.out.println(data);
		}
		System.out.println("============");
		// 배열을 ArrayList로 변환
		List<String> list = Arrays.asList(sArray);
		System.out.printf(list.toString());
		System.out.println("============");
		// 2번째 위치 삭제
		// 전체삭제
		aList.clear();
		// 빈공간 확인
		// 출력메소드
	}

	private static void print(String[] sArray, ArrayList<String> aList) {
		for(int i=0;i<aList.size();i++) {
			System.out.printf("%s %s\n",aList.get(i),sArray[i]);
		}
		System.out.println("=============");
	}
}
