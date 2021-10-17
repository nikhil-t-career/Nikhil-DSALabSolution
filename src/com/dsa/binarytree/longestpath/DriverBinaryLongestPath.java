package com.dsa.binarytree.longestpath;

import static com.dsa.binarytree.longestpath.BinaryTree.createNewNode;
import static com.dsa.binarytree.longestpath.BinaryTree.longestPath;

import java.util.List;

import com.dsa.binarytree.longestpath.BinaryTree.Node;

/**
 * Driver class to create and print longest path of a Binary Tree
 * @author fullstack8
 *
 */
public class DriverBinaryLongestPath {
	
	public static void main(String[] args)
	{
	    Node root = createNewNode(1);
	    root.left = createNewNode(2);
	    root.right = createNewNode(3);
	    root.left.right = createNewNode(4);
	    root.left.left = createNewNode(5);
	    root.left.right.right = createNewNode(6);
	    root.left.right.left = createNewNode(7);
	    root.left.right.left.right = createNewNode(8);
	     
	    List<Integer> longestPath = longestPath(root);
	    int n = longestPath.size();
	     
	    System.out.print(longestPath.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + longestPath.get(i));
	    }
	}

}
