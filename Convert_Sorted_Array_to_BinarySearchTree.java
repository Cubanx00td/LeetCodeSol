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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode res = bstHelper(nums, 0, nums.length-1);
        return res;
    }
    public TreeNode bstHelper(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = bstHelper(arr, start, mid-1);
        node.right = bstHelper(arr, mid+1, end);
        return node;
    }
}
