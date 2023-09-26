package ch07.exam06;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Location> hsMap = new HashMap<String, Location>();
		System.out.println("도시, 경도, 위도를 입력하세요.콤마(,)로 구분");

		for (int i = 0; i < 4; i++) {
			System.out.printf(">>");
			String str = scan.nextLine();
			String[] sArray = str.split(",");
			String cityName = sArray[0].trim();
			int lat = Integer.parseInt(sArray[1].trim());
			int lon = Integer.parseInt(sArray[2].trim());
			hsMap.put(cityName, new Location(cityName, lat, lon));
		}

//		hsMap.put("서울", new Location("서울",37, 126));
//		hsMap.put("LA", new Location("LA",34, -118));
//		hsMap.put("파리", new Location("파리",2, 48));
//		hsMap.put("시드니", new Location("시드니",151, -33));

		System.out.println("\n---------------------------------");
		Set<String> keyset = hsMap.keySet();
		for (String key : keyset) {
			System.out.printf("%s\n", hsMap.get(key).toString());
		}
		System.out.println("---------------------------------");

		for (; true;) {
			System.out.printf("도시이름>>");
			String search = scan.next().trim();
			if (search.equals("그만"))
				break;
			if (hsMap.get(search) != null) {
				System.out.printf("%s, %s, %s \n", search, hsMap.get(search).getLat(), hsMap.get(search).getLon());
			} else {
				System.out.printf("%s는 없습니다. \n", search);
			}
		}
		System.out.print("\nEND");
	}
}
