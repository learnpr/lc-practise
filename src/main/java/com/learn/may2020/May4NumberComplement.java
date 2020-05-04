package com.learn.may2020;

public class May4NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
	
	public static int findComplement(int num) {
		double numLog = Math.log(num);
		double twoLog = Math.log(2);
		double floor_ = Math.floor(numLog / twoLog);
		
		System.out.println("Num log: "+numLog +" twoLog: "+twoLog+" floor_: "+floor_);
		int bits = (int)((floor_) + 1);
		
		System.out.println("Bits: "+bits);
		int complement =(((1 << bits) - 1) ^ num);
		System.out.println("Complement: "+complement);
		
		return complement;
    }
}
