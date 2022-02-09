package com.logical.week2;

public class AmericanFlag {
	public static void printAmericanFlag() {
		int star=0;
		//start 
		for(int i=0;i<15;i++) {
			if(i<9) {
				if(i%2==0)
					star = 6;
				else
					star = 5;
				for(int j = 0; j<star;j++)
					System.out.print("* ");//print *  as per required number
				if(star==5)
					System.out.print("  ");
				for(int j = 0; j<34; j++)
					System.out.print("=");//print = for 34 times
					
			}else {
				for(int j=0; j<46;j++) {
					System.out.print("=");//print  = for 46 times
				}//inner-for
			}//if-else
			System.out.println();
		}//outer for
	}//printAmericanFlag()
	
	public static void main(String[] args) {
		//execute printAmericanFlag()
		printAmericanFlag();
	}//main(-)
}//AmericanFlag

