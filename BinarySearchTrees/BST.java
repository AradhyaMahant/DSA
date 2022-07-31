package BST;

public class BinarySearchTree {
	
		private TreeNode root;
	
		public class TreeNode{
			private int data;
			private TreeNode left;
			private TreeNode right;
			
			public TreeNode(int data) {
				this.data = data;
			}
		}
		
		public void insert(int value) {
			root = insert(root, value);
		}
		
		//function to insert value
		public TreeNode insert(TreeNode root, int value) {
			if(root==null) {
				root = new TreeNode(value);
				return root;
			}
			if(value<root.data) {
				root.left = insert(root.left,value);
			}
			else {
				root.right = insert(root.right,value);
			}
			return root;
		}
		
		public void InOrder() {
			InOrder(root);
		}
		//inorder treversal to print the tree
		public void InOrder(TreeNode root) {
			if(root == null) {
				return;
			}
			InOrder(root.left);
			System.out.print(root.data +" ");
			InOrder(root.right);
		}
		
		public static void main(String[] args) {
			BinarySearchTree bst = new BinarySearchTree();
			bst.insert(0);
			bst.insert(5);
			bst.insert(4);
			bst.insert(2);
			bst.insert(1);
			bst.insert(8);
			bst.insert(6);
			bst.insert(9);
			
			
			bst.InOrder();
		}
}