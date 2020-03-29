/**
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node 
in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
**/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return root;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode leftReturn = lowestCommonAncestor(root.left, p, q);
        TreeNode rightReturn = lowestCommonAncestor(root.right, p, q);
        
        if(leftReturn==null&&rightReturn==null){
            return null;
        }
        if(leftReturn!=null&&rightReturn==null){
            return leftReturn;
        }
        if(leftReturn==null&&rightReturn!=null){
            return rightReturn;
        }
        if(leftReturn!=null&&rightReturn!=null){
            return root;
        }

        
        return null;
    }

}
