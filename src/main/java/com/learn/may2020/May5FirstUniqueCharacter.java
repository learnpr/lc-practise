package com.learn.may2020;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * <p>
 * s = "leetcode" return 0.
 * </p>
 * <p>
 * s = "loveleetcode", return 2.
 * </p>
 */
public class May5FirstUniqueCharacter {

	public static int firstUniqChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] arr = s.toCharArray();

		for (Character c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		char c = ' ';
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				c = e.getKey();
				break;
			}
		}

		for (int i = 0; i < arr.length; ++i) {
			if (c == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
