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
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            Integer r=null;
            int qLen=q.size();
            for(int i=0; i<qLen; i++){
                TreeNode node = q.poll();
                if(node != null){
                    r=node.val;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(r!=null) res.add(r);
         }
         return res;
    }
}
