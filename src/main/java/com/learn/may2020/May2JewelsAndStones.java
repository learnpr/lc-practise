package com.learn.may2020;

/**
 * <p>
 * You're given strings J representing the types of stones that are jewels, and
 * S representing the stones you have. Each character in S is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 * 
 * The letters in J are guaranteed distinct, and all characters in J and S are
 * letters. Letters are case sensitive, so "a" is considered a different type of
 * stone from "A".
 * </p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb" Output: 3
 * </p>
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ" Output: 0
 * </p>
 * Note:
 * <p>
 * S and J will consist of letters and have length at most 50. The characters in
 * J are distinct.
 * </p>
 */
public class May2JewelsAndStones {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbbb"));
	}

	public static int numJewelsInStones(String J, String S) {
		int i = 0;
		for (char j : J.toCharArray()) {
			for (char s : S.toCharArray()) {
				if (j == s) {
					++i;
				}
			}
		}
		return i;
	}
}
