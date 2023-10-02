package ch07.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		// ArrayList와 배열 선언
		String[] sArray = new String[10];
		ArrayList<String> sAList = new ArrayList();
		print(sArray,sAList);
		// 요소 추가
		for(int i=0;i<5;i++) {
			sArray[i]=new String((int)(Math.random()*(100)+(1))+"홍길동");
			sAList.add(new String((int)(Math.random()*(100)+(1))+"홍길동"));
		}
		// 출력
		print(sArray,sAList);
		// ArrayList >> Iterator 변환 출력
		System.out.println("======");
		Iterator<String> itr = sAList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// 문자열 정렬 출력
		System.out.println("======");
		Collections.sort(sAList);
		print(sArray, sAList);
		// 문자열 역정렬 출력

		System.out.println("======");
		Collections.reverse(sAList);
		print(sArray, sAList);
		// 2번째 위치 삽입
		sAList.add(2, null);
		// 객체 유무 확인
		sAList.contains(itr);
		// ArrayList를 배열로 변환
		Object[] str = sAList.toArray();
		for(Object data:str) {
			
		}
		// 배열을 ArrayList로 변환
		List<String> list = Arrays.asList(sArray);
		// 2번째 위치 삭제
		// 전체삭제
		
		// 빈공간 확인
		// 출력메소드
	}

	private static void print(String[] sArray, ArrayList<String> sAList) {
		for (int i = 0; i < sAList.size(); i++) {
			System.out.printf("%s %s\n",sArray[i],sAList.get(i));
		}
		
	}
}
