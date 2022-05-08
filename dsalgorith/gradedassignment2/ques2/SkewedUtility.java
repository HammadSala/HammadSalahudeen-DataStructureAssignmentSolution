package com.learning.dsalgorith.gradedassignment2.ques2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Skewed Utility class contains the below functions
 * Creation of new Node
 * This calls holds functions to make any binary tree as right Skewed tree using a traversal method 
 * 
 * 
 */

public class SkewedUtility {

	ArrayList<Integer> arr = new ArrayList<Integer>();
	Node skewRot = null;
	Node temp = null;
	Node sRoot = null;

	// Node definition
	public class Node {
		int data;
		Node left, right;

	}

	// Node declaration
	public Node newNode(int data) {
		Node tempNode = new Node();
		tempNode.data = data;
		tempNode.left = null;
		tempNode.right = null;

		return tempNode;
	}

	// innorder traversal method to flow over the binary tree and makes the copy of
	// the element in the arraylist
	public void innorderTraversal(Node root) {
		if (root == null) {
			return;
		}

		innorderTraversal(root.left);
//		System.out.println(root.data);
//		Adding the element in the tree to arrayList		
		arr.add(root.data);
		innorderTraversal(root.right);

//		System.out.println(arr.toString());

	}

	// function to perform the rightSkew
	public void rightSkewed(Node root) {

		// Calling inorder traversal to get all the element list in the binary
		innorderTraversal(root);

		// sort the element in the arrayList
		Collections.sort(arr);

		// Loop over the element in the arrayList and keep the adding each element tot
		// he right of the previous element
		// ass its already sorted in arraList
		arr.forEach((node) -> {
			// System.out.println(node);
			if (skewRot == null) {
				skewRot = newNode(node);
				temp = skewRot;
			} else {
				temp.right = newNode(node);
				temp = temp.right;

			}
		});

		System.out.println("Skewrot " + skewRot.data);

		skewedDisplay(skewRot);

	}

	public void skewedDisplay(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		skewedDisplay(root.right);

	}

}
