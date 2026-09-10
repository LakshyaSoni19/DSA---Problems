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
    int answer = 0 ;
    public int averageOfSubtree(TreeNode root) {
        calculate (root);
        return answer ;
        }
        private int[] calculate(TreeNode root){
            if(root ==null){
                return new int[] {0,0};
            }
            int[] left = calculate(root.left);
            int[] right = calculate(root.right);

            int sum = root.val + left[0] + right[0];
            int count = 1 + left[1] + right[1];

            if(sum /count == root.val){
                answer++;
            }
            return new int [] {sum , count};
        }
        
}