package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private TreeNode root;
	
	private class TreeNode{
		private TreeNode right;
		private TreeNode left;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	 
	
	public void CreateTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
	}
	
	//PreOderTreversal
	public void PreOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+"-->");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	
	//InOderTreversal
	public void InOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		InOrder(root.left);
		System.out.print(root.data+"-->");
		InOrder(root.right);
	}
	
	//PostOderTreversal
	public void PostOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+"-->");
	}
	
	
	//Level Order Traversal
	
	public void LevelOrder() {
		if(root == null) {
			return ;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
		TreeNode temp = queue.poll();
		System.out.print(temp.data+"-->");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.CreateTree();
		System.out.println("Pre order is :");
		bt.PreOrder(bt.root);
		
		System.out.println(" ");
		System.out.println("In order is :");
		bt.InOrder(bt.root);
		
		System.out.println(" ");
		System.out.println("Post order is :");
		bt.PostOrder(bt.root);
		
		System.out.println(" ");
		System.out.println("Level order is :");
		bt.LevelOrder();
	}
}
