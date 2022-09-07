package com.ZSGS;

//import java.util.stream.IntStream;

public class DoubleNTimes {

	public static void main(String[] args) {		
		System.out.println(doubleNTimes(2, 10));
	}
	

//	public static int doubleNTimes(int num, int n) {
//		return IntStream.of(new int[n]).reduce(1,(n1,n2) -> (n1*num));
//	}
	
	// Double given number n times with "one line of code"
	public static int doubleNTimes(int num, int n) {
		return num<<n;
	}

}
