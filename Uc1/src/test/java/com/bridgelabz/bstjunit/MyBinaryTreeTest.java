package com.bridgelabz.bstjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.bst.MyBinaryTree;

public class MyBinaryTreeTest {
	@Test
	public void givenNumWhenAddedToBinaryTree_shouldReturnSizeOfTree() {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		System.out.println(size);
		assertEquals(4,size);
	}
}
