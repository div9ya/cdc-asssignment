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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        findInorder(root,inorder);
        for(int i=1;i<inorder.size();i++)
        {
            if(inorder.get(i)<=inorder.get(i-1))
            return false;
        }
        return true;
    }
    public void findInorder(TreeNode node,List<Integer> inorder)
    {
        if(node==null)
        return;
        findInorder(node.left,inorder);
        inorder.add(node.val);
        findInorder(node.right,inorder);
    }
}
