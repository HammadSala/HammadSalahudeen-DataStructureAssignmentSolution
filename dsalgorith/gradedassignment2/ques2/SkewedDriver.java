package com.learning.dsalgorith.gradedassignment2.ques2;

import com.learning.dsalgorith.gradedassignment2.ques2.SkewedUtility.Node;

/*
 * Driver class , which sends a Binary tree root as input and call rightSkewed tree functions on the utility
 * 
 * 
 */

public class SkewedDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkewedUtility uObject = new SkewedUtility();

		// Hard coding BINARY TREE
		Node root = uObject.newNode(50);
		root.left = uObject.newNode(30);
		root.right = uObject.newNode(60);
		root.left.left = uObject.newNode(10);
		root.right.right = uObject.newNode(55);

		// uObject.innorderTraversal(root);
		uObject.rightSkewed(root);

	}

}
