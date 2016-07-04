/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> l=new LinkedList<Integer>();
        Stack<TreeNode> s1=new Stack<TreeNode>();
        Stack<Integer> s2=new Stack<Integer>();
        
        if(root==null){
            return l;
        }
        else{
            s1.push(root);
            
            while(!s1.isEmpty()){
                
                TreeNode t=s1.pop();
                s2.push(t.val);
                
                if(t.left!=null){
                    s1.push(t.left);
                }
                
                if(t.right!=null){
                    s1.push(t.right);
                }
            }
            
            while(!s2.isEmpty()){
                l.add(s2.pop());
            }
         return l;   
        }
        
    }
}
