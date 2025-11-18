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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> mpp=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<descriptions.length;i++)
        {
            if(!mpp.containsKey(descriptions[i][0]))
            {
                mpp.put(descriptions[i][0],new TreeNode(descriptions[i][0]));
            }
            if(!mpp.containsKey(descriptions[i][1]))
            {
                mpp.put(descriptions[i][1],new TreeNode(descriptions[i][1]));
            }
            if(descriptions[i][2]==1)
            {
                mpp.get(descriptions[i][0]).left=mpp.get(descriptions[i][1]);
            }
            else
            {
                mpp.get(descriptions[i][0]).right=mpp.get(descriptions[i][1]);
            }
            set.add(descriptions[i][1]);
        }
        for(int[] arr:descriptions)
        {
            int parent=arr[0];
            if(!set.contains(parent))
            return mpp.get(parent);
        }
        return null;
    }
}
