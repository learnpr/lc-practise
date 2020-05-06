package com.learn.may2020;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * <P>
 * Example 1:
 * 
 * Input: [3,2,3] Output: 3
 * </P>
 * <P>
 * Example 2:
 * 
 * Input: [2,2,1,1,1,2,2] Output: 2
 * </P>
 */
public class May6MajorityElement {
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		int i = -1, j = -1;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (i < e.getValue()) {
				i = e.getValue();
				j = e.getKey();
			}
		}

		return j;
	}

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}
}
