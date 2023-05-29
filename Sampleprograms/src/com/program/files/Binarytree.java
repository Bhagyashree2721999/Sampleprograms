package com.program.files;

public class Binarytree {

	static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTreeOne {
		static int index = -1;

		public static Node buildTree(int nodes[]) {
			index++;
			if (nodes[index] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[index]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		public void preorder(Node root) {
			if (root == null) {
				return;
			}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);

		}
	}

	public void inorder(Node root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);

	}

	public void postorder(Node root) {
		if (root == null) {
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);

	}

	public static void main(String args[]) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTreeOne tree = new BinaryTreeOne();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);

	}
}
