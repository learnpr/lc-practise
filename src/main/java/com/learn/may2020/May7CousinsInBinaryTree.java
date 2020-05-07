package com.learn.may2020;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

/**
 * In a binary tree, the root node is at depth 0, and children of each depth k
 * node are at depth k+1.
 * 
 * Two nodes of a binary tree are cousins if they have the same depth, but have
 * different parents.
 * 
 * We are given the root of a binary tree with unique values, and the values x
 * and y of two different nodes in the tree.
 * 
 * Return true if and only if the nodes corresponding to the values x and y are
 * cousins.
 * <p>
 * Input: root = [1,2,3,4], x = 4, y = 3 Output: false
 * </p>
 * <p>
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4 Output: true
 * </p>
 * <p>
 * Input: root = [1,2,3,null,4], x = 2, y = 3 Output: false
 * </p> 
 */
public class May7CousinsInBinaryTree {

	public boolean isCousins(TreeNode root, int x, int y) {
		Level l1 = findLevel(root, x, 1, root.val);
		Level l2 = findLevel(root, y, 1, root.val);

		return (l1.level == l2.level && l1.ch != l2.ch);
	}

	private Level findLevel(TreeNode node, int val, int level, int c) {
		if (node == null)
			return new Level(0, c);

		if (node.val == val)
			return new Level(level, c);

		Level l = findLevel(node.left, val, level + 1, node.val);

		if (l.level != 0)
			return l;

		return findLevel(node.right, val, level + 1, node.val);
	}

	class Level {
		int level;
		int ch;

		public Level(int level, int ch) {
			this.level = level;
			this.ch = ch;
		}
	}

	TreeNode root;

	public static void main(String args[]) {
		May7CousinsInBinaryTree tree = new May7CousinsInBinaryTree();

		// st case
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.right = new TreeNode(4);
		if (tree.isCousins(tree.root, 2, 3))
			System.out.println("Yes");
		else
			System.out.println("No");

//		tree.root = new TreeNode(1);
//		tree.root.left = new TreeNode(2);
//		tree.root.right = new TreeNode(5);
//		tree.root.left.left = new TreeNode(3);
//		tree.root.right.right = new TreeNode(6);
//		tree.root.left.left.left = new TreeNode(4);
//		
//		if (tree.isCousins(tree.root, 3, 6))
//			System.out.println("Yes");
//		else
//			System.out.println("No");

		// -another case
//		tree.root = new TreeNode(1);
//		tree.root.right = new TreeNode(2);
//		tree.root.right.left = new TreeNode(3);
//		tree.root.right.right = new TreeNode(5);
//		tree.root.right.left.left = new TreeNode(4);
//		tree.root.right.left.left.right = new TreeNode(6);
//		
//		if (tree.isCousins(tree.root, 5, 3))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
	}

}