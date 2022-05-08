package com.learning.dsalgorith.gradedassignment2.ques1;

import java.util.Scanner;

/*
 * SkyScrapper Driver, this passes the array of the floor for the given day to utility
 * and get this floor building day plan as per logic
 * 
 */

public class Skyscraper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SkyscraperUtility ob = new SkyscraperUtility();
		Scanner sc = new Scanner(System.in);
		int n;
		int arr[];

		System.out.println("Enter the number of flors in the building");
		n = sc.nextInt();
		arr = new int[n];

		// gathering the floor delivered details
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the floor size given on day : " + (i + 1));
			arr[i] = sc.nextInt();
		}

		// calling skyscraper Utility with floor details
		ob.skyScrap(arr, n);

		sc.close();
	}

}
