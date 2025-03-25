public class Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {
        System.out.println();
    }
}
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
/*
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> list = new ArrayList<>(levelsize);
            for(int i =0;i<levelsize;i++){
                TreeNode tn = queue.poll();
                list.add(tn.val);
                if(tn.left != null){
                    queue.offer(tn.left);
                }
                if(tn.right != null){
                    queue.offer(tn.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
*/

