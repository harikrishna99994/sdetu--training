package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {

		// Implement Map Interface
		Map<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtil(hMap);

	}

	private static void mapUtil(Map<Integer, String> map) {
		// 1. Add Key -Value Pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22, "Jenifer");
		map.put(36, "Allie");
		map.put(315, "Mike");
		map.put(750, "Kelly");

		// 2. Expose / access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all the key-value pairs: " + map);
		System.out.println(map.get(502));

		// 3. Iterate through map of key-valu pairs?
		for (int key : map.keySet()) {
			System.out.println("[KEY: " + key + ", VALUE: " + map.get(key) + "]");
		}
	}
}
