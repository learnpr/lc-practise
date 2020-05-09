package com.learn.may2020;

/**
 * Perfect Square: Given a positive integer num, write a function which returns True if num is a perfect square else False.
 */
public class May9PerfectSqare {
	public static boolean isPerfectSquare(int num) {
		double r = Math.sqrt(num);
		return ((r - Math.floor(r)) == 0);
	}

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(25));
		System.out.println(isPerfectSquare(24));
	}
}