package com.learn.may2020;

/**
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y]
 * represents the coordinate of a point. Check if these points make a straight
 * line in the XY plane.
 * <p>
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]] Output: true
 * </p>
 * <p>
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]] Output: false
 * </p>
 */
public class May8CheckStraightLine {
	public static boolean checkStraightLine(int[][] coordinates) {

		int x1 = coordinates[0][0];
		int y1 = coordinates[0][1];

		int x2 = coordinates[1][0];
		int y2 = coordinates[1][1];

		int dx = x2 - x1;
		int dy = y2 - y1;

		for (int i = 0; i < coordinates.length; ++i) {

			int x = coordinates[i][0];
			int y = coordinates[i][1];

			if (dx * (y - y2) != dy * (x - x2)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };// { { 0, 0 }, { 5, 5 }, { 1, 1 },
																						// { 3, 3 }, { 2, 2 } };
		System.out.println(checkStraightLine(arr));
	}
}
