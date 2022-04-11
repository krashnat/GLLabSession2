package com.gl.main;

import java.util.Scanner;

import com.gl.transaction.Transaction;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Transaction t=new Transaction();

		System.out.println("enter the size of transaction array");
		int size=scan.nextInt();
		int[] transactins=new int[size];
		
		System.out.println("Enter the values of array");
		for(int i = 0; i < size; i++)
		{
			transactins[i] = scan.nextInt();
		}
		
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTarget=scan.nextInt();
		
		
		
		for(int i = 0; i < numberOfTarget; i++)
		{
			System.out.println("enter the value of target");
			int target=scan.nextInt();
			t.testTransaction(transactins, target);

		}
		
				
		
		

	}

}
