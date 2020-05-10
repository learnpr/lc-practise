package com.learn.may2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class May10FindTheTownJudge {
	public static int findJudge(int N, int[][] trust) {
		if (trust.length == 0)
			return 1;

		int[] parents = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			parents[i] = i;
		}

		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int[] data : trust) {
			int a = data[0];
			int b = data[1];
			parents[a] = b;
			if (!map.containsKey(b)) {
				List<Integer> l = new ArrayList<>();
				l.add(a);
				map.put(b, l);
			} else {
				map.get(b).add(b);
			}
		}

		for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
			if (e.getValue().size() == N - 1) {
				int key = e.getKey();
				if (parents[key] != key)
					return -1;
				return key;
			}
		}
		return -1;
	}
//	public static int findJudge(int N, int[][] trust) {
//
//		Set<Integer> s1 = new HashSet<Integer>();
//		Set<Integer> s2 = new HashSet<Integer>();
//
//		for (int i = 0; i < trust.length; ++i) {
//			s1.add(trust[i][0]);
//			s2.add(trust[i][1]);
//		}
//
//		s2.removeAll(s1);
//
//		return s2.size() > 0 && s2.size()>N-1? getData(s1, s2) : -1;
//	}
//
//	private static int getData(Set<Integer> s1, Set<Integer> s2) {
//		for (int i : s2) {
//			return i;// s1.contains(i)?i:-1;
//		}
//		return -1;
//	}

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
		int[][] arr2 = { { 1, 2 }, { 2, 3 } };
		int[][] arr3 = { { 1, 3 }, { 2, 3 } };


		System.out.println(findJudge(3, arr1));
		System.out.println(findJudge(3, arr2));
		System.out.println(findJudge(3, arr3));

	}
}