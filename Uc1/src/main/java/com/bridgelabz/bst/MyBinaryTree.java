package com.bridgelabz.bst;

public class MyBinaryTree<T extends Comparable<T>> {
	private MyBinaryNode<T> root;
	public void add(T key) {
		this.root=this.addRecursively(root,key);
	}
	private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current, T key) {
		if(current==null) {
			return new MyBinaryNode<>(key);
		}
		int compare=key.compareTo(current.key);
		if(compare==0) {
			return current;
		}
		else if(compare<0) {
			current.left=addRecursively(current.left,key);
		} else {
			current.right=addRecursively(current.right,key);
		}
		return current;
	}
	public int getSize() {
		return this.getSizeRecursively(root);
	}
	private int getSizeRecursively(MyBinaryNode<T> rootNode) {
		return rootNode==null?0:1+this.getSizeRecursively(rootNode.left)+this.getSizeRecursively(rootNode.right);
	}
}
