package com.learn.may2020;

/**
 * <p>
 You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
</p>
Example:
<p>
Given n = 5, and version = 4 is the first bad version.
</p>
<p>call isBadVersion(3) -> false</p>
<p>call isBadVersion(5) -> true</p>
<p>call isBadVersion(4) -> true</p>

Then 4 is the first bad version. 


 */
public class May1FirstBadVersion {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));
		//2126753390
		//1702766719
	}
	
   	public static int firstBadVersion(int n) {

		boolean a = isBadVersion(n);
		boolean b = isBadVersion(n/2);
		boolean c= isBadVersion(n/4);
		
		if (c) {
			for (int i = n / 4; i >= 0; --i) {
				if (isBadVersion(i)) {
					continue;
				} else {
					return i + 1;
				}
			}
		}

		if (b) {
			for (int i = n / 2; i >= n/4; --i) {
				if (isBadVersion(i)) {
					continue;
				} else {
					return i + 1;
				}
			}
		}
		
		if (a) {
			for (int i = n; i >= n / 2; --i) {
				if (isBadVersion(i)) {
					continue;
				} else {
					return i + 1;
				}
			}
		}

		return -1;
	}
   	
	private static boolean isBadVersion(int i) {
		if(i>1702766719)
			return true;
		return false;
	}
}
