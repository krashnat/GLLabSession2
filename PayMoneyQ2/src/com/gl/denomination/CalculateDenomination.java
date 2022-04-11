package com.gl.denomination;

import java.util.Arrays;

public class CalculateDenomination {

	
	public void countCurrency(int[] notes, int amount) {
		int[] noteCounter=new int[notes.length];
		try {
			for(int i=0;i<notes.length;i++) {
				if(amount >=notes[i]) {
					noteCounter[i]=amount/notes[i];
					amount=amount-noteCounter[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("amount can't pay with given denomination");
			}
			
			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0;i<notes.length;i++) {
					if(noteCounter[i]!=0) {
						System.out.println(notes[i]+":"+noteCounter[i]);
					}
				}
			}
		}
		catch(Exception e) {
			
			System.out.println("invalid entry");
			
		}
	}

		

}
