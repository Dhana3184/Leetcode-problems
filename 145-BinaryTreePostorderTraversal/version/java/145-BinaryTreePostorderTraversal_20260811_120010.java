// Last updated: 11/08/2026, 12:00:10
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> res=new ArrayList<>();
19        postorder(root,res);
20        return res;
21    }
22    void postorder(TreeNode root,List<Integer> res){
23        if(root==null){
24            return;
25        }
26        postorder(root.left,res);
27        postorder(root.right,res);
28        res.add(root.val);
29    }
30}