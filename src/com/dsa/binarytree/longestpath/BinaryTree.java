package com.dsa.binarytree.longestpath;

import java.util.ArrayList;

/**
 * Class to have Binary Tree
 * - calculate longest path
 * @author fullstack8
 *
 */
public class BinaryTree {

	// Binary tree node
	static class Node {
		Node left;
		Node right;
		int data;
	};

	public static Node createNewNode(int data) {
		Node temp = new Node();

		temp.data = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	public static ArrayList<Integer> longestPath(Node root) {

		// If root is null return tree as Empty
		if (root == null) {
			ArrayList<Integer> output = new ArrayList<>();
			return output;
		}

		// recursive call on root.right
		ArrayList<Integer> right = longestPath(root.right);

		// recursive call on root.left
		ArrayList<Integer> left = longestPath(root.left);

		// Compare the size of the two ArrayList
		// and insert current node accordingly
		if (right.size() < left.size()) {
			left.add(root.data);
		} else {
			right.add(root.data);
		}

		// Return the longest ArrayList
		return (left.size() > right.size() ? left : right);
	}

}