package ch07.sec02;

import java.util.*;

//import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		// ArrayList 선언
		String[] strArray = new String[10];
		ArrayList<String> strList = new ArrayList<String>();

		// 추가
		for (int i = 0; i < 5; i++) {
			int no = (int) (Math.random() * (100 - 1 + 1) + (1));
			strArray[i] = new String("홍길동" + no);
			strList.add(new String("홍길동" + no));
		}

		// 가져오기
		pringArrayAndList(strArray, strList);

		// 삽입(2번째 위치 삽입)
		strArray[1] = new String("저길동");
		strList.add(1, new String("저길동"));
		System.out.println("====================================");
		pringArrayAndList(strArray, strList);

		// 해당되는 객체가 존재하는지 확인 (저길동)
		boolean isFind = false;
		int indexOf = -1;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null && strArray[i].equals("저길동")) {
				isFind = true;
				indexOf = 1;
				break;
			}
		}
		System.out.println("====================================");
		System.out.printf("배열에 저길동이 %s\n", (isFind == true) ? "있어요" : "없어요");
		System.out.printf("배열에 저길동이 위치는 %d\n", indexOf);
		System.out.printf("리스트에 저길동이 %s\n", (strList.contains("저길동") == true) ? "있어요" : "없어요");
		System.out.printf("리스트에 저길동이 위치는 %d\n", strList.indexOf("저길동"));

		// ArrayList를 toArray 배열로 변환
		System.out.println("====================================");
		Object[] obj = strList.toArray();
		for (Object data : obj) {
			System.out.printf("%s ", data);
		}

		System.out.printf("\n");
		// 배열을 ArrayList로 변환
		List<String> list = Arrays.asList(strArray);
		for (String data : list) {
			System.out.printf("%s ", (data != null) ? data : "");
		}

		System.out.printf("\n");
		// 삭제(2번째 위치 삭제)
		strArray[1] = null;
		strList.remove(1);
		System.out.println("====================================");
		pringArrayAndList(strArray, strList);

		// 전체 삭제
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = null;
		}
		strList.clear();
		System.out.println("====================================");
		System.out.printf("strArray.length()= %d\n", strArray.length);
		System.out.printf("strList.size()= %d\n", strList.size());

		// isEmpty()
		boolean isEmpty = true;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null) {
				isEmpty = false;
			}
		}
		System.out.println("====================================");
		System.out.printf("strArray %s\n", (isEmpty == true) ? "비어있어요" : "값이 있어요");
		System.out.printf("strList %s\n", (strList.isEmpty() == true) ? "비어있어요" : "값이 있어요");

		System.out.println("END");
	}

	private static void pringArrayAndList(String[] strArray, ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s\t", i, strArray[i]);
			System.out.printf("strList[%d]=%s\n", i, strList.get(i));
		}
	}
}
