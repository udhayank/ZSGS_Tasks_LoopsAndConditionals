package com.ZSGS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RiceBagInChessBoard {

	public static void main(String[] args) {
		
		
		BigInteger res = new BigInteger("1");
		// Using BigInteger list because long range is 2^63-1 and 2^63 cannot be stored
		List<BigInteger> chessBoard = new ArrayList<>();
		chessBoard.add(BigInteger.valueOf(1));
		for (int i=0; i<63; i++) {
			chessBoard.add(chessBoard.get(i).multiply(BigInteger.valueOf(2)));			
			res = res.add(chessBoard.get(i+1));
		}
		
		System.out.println(res);

	}

}
