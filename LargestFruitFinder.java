package com.logical.week1;

import java.util.Arrays;
import java.util.Scanner;

public class LargestFruitFinder {
	
	public static void findLargestFruit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fruits you want to enter:: ");
		int maxLength=0;
		int numOfFruits =sc.nextInt();
		String[] fruits= new String[numOfFruits];
		//take all fruits
		System.out.println("Enter Fruit Name:: ");
		for(int num=0;num<numOfFruits; num++) {
			fruits[num]=sc.next();
			if(num<numOfFruits-1)
				System.out.println("Enter next fruit name:: ");
		}//for
		//sort array
		Arrays.sort(fruits);
		//find max length of fruit
		for(int i=0;i<numOfFruits;i++) {
			if(fruits[i].length()>maxLength) {
				maxLength = fruits[i].length();
			}//if
		}//for
		System.out.println("Largest Fruit:: ");
		//print the largest  fruit
		for(int i=0;i<numOfFruits;i++) {
			if(fruits[i].length()==maxLength) {
				System.out.println(fruits[i]);
			}//if
		}//for
		
	}//findLargestFruit()
	public static void main(String[] args) {
		LargestFruitFinder.findLargestFruit();
		

	}//main(-)
}//LargestFruitFinder
