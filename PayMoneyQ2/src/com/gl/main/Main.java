package com.gl.main;

import java.util.Scanner;

import com.gl.denomination.CalculateDenomination;
import com.gl.denomination.Sorting;

public class Main {

	public static void main(String[] args) {
		
		
		CalculateDenomination calculate=new CalculateDenomination();
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
        int size=scan.nextInt();
        int[] currencies=new int[size];
        
        System.out.println("Enter the currency denominations value");
        
        for(int i=0;i<size;i++) {
        	currencies[i]=scan.nextInt();
        }
        
        Sorting sort=new Sorting();
        currencies=sort.sort(currencies, 0, currencies.length-1);
        
       
        System.out.println("Enter the amout you want to pay");
        int amount=scan.nextInt();
        
        
        calculate.countCurrency(currencies, amount);
	}

}
