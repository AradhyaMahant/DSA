class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)return null;
        
        if(root.val == key){
            //no child
            if(root.right == null && root.left == null) return null;
            //1 child
            if(root.left == null && root.right != null) return root.right;
            if(root.right == null && root.left != null) return root.left;
            //2 child
            TreeNode node = helper(root.right,root);
            root.val = node.val;
        }else if(root.val < key){
            root.right = deleteNode(root.right,key);
            
        }else{
            root.left = deleteNode(root.left,key);
    }
        return root;
    }
    private TreeNode helper(TreeNode root, TreeNode parent){
        TreeNode cur = root,per = parent;
        if(cur.left != null){
            per = cur;
            cur = cur.left;
        }
        deleteNode(per, cur.val);
        return cur;
    }
}