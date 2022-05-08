package com.learning.dsalgorith.gradedassignment2.ques1;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * Utility defined public receives integer array and the length
 * Return void
 * Prints order of the floor numbers based on descending order and  on the order entered position
 * 
 * 
 */

public class SkyscraperUtility {

	int temp[];
	int max;

	public void skyScrap(int[] arr, int n) {

		max = n;
		temp = new int[n];
		System.out.println("Order of construction as follows..");

		// defining the priority on the reverse order so that can be removed from the
		// queue whenever logic meets
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.println("Day : " + (i + 1));

			temp[i] = arr[i];
			Q.add(temp[i]);

			// System.out.println(Q.toString());

			// Checking and displaying/removing the item in the pQueue if condition is
			// matched
			while (!Q.isEmpty() && Q.peek() == max) {
				System.out.print(Q.poll() + " ");
				max--;
			}

			System.out.println();
		}

	}

}
