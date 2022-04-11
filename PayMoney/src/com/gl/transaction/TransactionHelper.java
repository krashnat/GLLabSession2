package com.gl.transaction;

public class TransactionHelper {

	public int checkTarget(int[] transactions, int target) {
		
		int sum=0;
		for(int i=0;i<transactions.length;i++) {
			sum=sum+transactions[i];
			
			if(sum >= target) {
				return i+1;
			}
			
		}
		return 0;
		
	}

}
