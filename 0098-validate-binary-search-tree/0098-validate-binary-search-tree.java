class Solution {
    public boolean isValidBST(TreeNode root) {
        return solve(root, null, null);
    }

    public boolean solve(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.val <= min) ||
            (max != null && root.val >= max)) {
            return false;
        }

        boolean left = solve(root.left, min, root.val);
        boolean right = solve(root.right, root.val, max);

        return left && right;
    }
}