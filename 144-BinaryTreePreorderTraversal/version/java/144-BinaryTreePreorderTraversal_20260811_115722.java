// Last updated: 11/08/2026, 11:57:22
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> res=new ArrayList<>();
19        preorder(root,res);
20        return res;
21    }
22    void preorder(TreeNode root,List<Integer> res){
23        if(root==null){
24            return;
25        }
26        res.add(root.val);
27        preorder(root.left,res);
28        preorder(root.right,res);
29    }
30}