package com.gl.transaction;

public class Transaction {
	
	TransactionHelper tra =new TransactionHelper();
	
	public void testTransaction(int[] transactions,int targets) {
		
		
			int isAchieved=tra.checkTarget(transactions, targets);
			
			if(isAchieved >0) {
				System.out.println("Target achieved after "+isAchieved+" transactions");
			}
			else {
				System.out.println("Given target is not achieved");
			}
			
			
			
		
		
	}

}
