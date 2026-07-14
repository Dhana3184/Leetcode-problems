// Last updated: 14/07/2026, 14:19:31
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        while(root!=null || !st.empty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            ls.add(root.val);
            root=root.right;
        }
        return ls;
    }
}