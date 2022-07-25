public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        StringBuilder ans=new StringBuilder();
        
        if(root==null)
        return ans.append("#").toString();
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        ans.append(root.val+" ");
        
        while(!queue.isEmpty())
        {
            int n=queue.size();
            
            for(int i=0;i<n;i++)
            {
                TreeNode curr=queue.poll();
                
                if(curr.left!=null)
                {
                    queue.offer(curr.left);
                    ans.append(curr.left.val+" ");
                }
                else
                ans.append("# ");
                
                if(curr.right!=null)
                {
                    queue.offer(curr.right);
                    ans.append(curr.right.val+" ");
                }
                else
                ans.append("# ");
            }
                
        }
        return ans.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data.equals("#"))
        return null;
        
        String s[]=data.split(" ");
        
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(s[0]));
        queue.offer(root);
        int i=1;
        
        while(i<s.length)
        {
            TreeNode parent=queue.poll();
            
            String word=s[i];
            
            if(word.equals("#"))
            parent.left=null;
            else
            {
                TreeNode child=new TreeNode(Integer.parseInt(word));
                parent.left=child;
                queue.offer(child);
            }
            
            i++;
            
            word=s[i];
            if(word.equals("#"))
            parent.right=null;
            else
            {
                TreeNode child2=new TreeNode(Integer.parseInt(word));
                parent.right=child2;
                queue.offer(child2);
            }
            
            i++;
        }
        
        return root;
    }
}
