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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> paths  = new ArrayList<List<Integer>>();
    List<Integer> path  = new ArrayList<Integer>();
        findPath(root, targetSum, path, paths);
    return paths;         
    }
    
    private void findPath(TreeNode Node, int sum,List<Integer> path , List<List<Integer>> paths){
        if(Node == null) {
            return ;
        }
        path.add(Node.val);
        if(sum == Node.val && Node.left == null && Node.right == null) {
            paths.add(new ArrayList(path));
        } else {
           findPath (Node.left, sum - Node.val, path, paths);
            findPath(Node.right, sum - Node.val, path,paths);
        }
        path.remove(path.size() - 1);
    }
}
                      
                      
                      
                      