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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        return list;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,root.val);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmptay())
        {
            int size=q.size();
            level=level+1;
            for(int i=0;i<size;i++)
            {
                TreeNode node=q.remove();
                if(node.left!=null)
                {
                    mpp.put(level,node.left.val);
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    mpp.put(level,node.right.val);
                    q.add(node.right);
                }
            }
        }
        for(Map.Entry<Integer,Integer> entry:mpp.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;
    }
}
