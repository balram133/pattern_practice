package com.logical.week2;

public class StarPattern {

	public static void printPattern1() {
		/**
		     *
		    ***
		   *****
		  *******
		 **/
		for(int l =0;l<4;l++) {
			for(int i = 3-l;i>0;i--) {
				System.out.print(" ");
			}//inner for 1
			for(int j = (2*l)+1;j>0;j--) {
				System.out.print("*");
			}//inner for 2
			System.out.println();
		}//outer for
	}//printPattern1()
	public static void printPyramid() {
		/**
	      *
	     * *
	    * * *
	   * * * *
	  * * * * *
	 **/
		for(int l = 1;l<=5;l++) {
			for(int i=5-l;i>0;i--) {
				System.out.print(" ");
			}//inner-for 1
			for(int j=l;j>0;j--) {
				System.out.print("* ");
			}//inner-for 2
			System.out.println();
		}//outer-for
	}//printPyramid()
	public static void main(String[] args) {
		//printPattern1();
		printPyramid();
	}//main(-)
	
	
}//StarPattern
