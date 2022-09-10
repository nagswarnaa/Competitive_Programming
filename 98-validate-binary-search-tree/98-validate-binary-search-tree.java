/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> elements=new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        boolean ret=true;
        Inorder(root);
        for(int i=0;i<elements.size()-1;i++){
            if(elements.get(i)>=elements.get(i+1)){
                ret=false;
            }
        }
        return ret;
    }
    public void Inorder(TreeNode root){
        if(root!=null){
            Inorder(root.left);
            elements.add(root.val);
            Inorder(root.right);
        }       
    }
}