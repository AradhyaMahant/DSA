package BinaryTrees;


public class MaxValBT {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void CreateTree(){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(8);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}
	
	public int findmax() {
		return FindMax(root);
	}
	public int FindMax(TreeNode root){
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		int result = root.data;
		int left = FindMax(root.left);
		int right = FindMax(root.right);
		if(left>result)
			result = left;
		if(right>result)
			result = right;
		
		return result;
	}
	
	public static void main(String[] args) {
		MaxValBT BT = new MaxValBT();
		BT.CreateTree();
		System.out.println(BT.findmax());
	}
}
