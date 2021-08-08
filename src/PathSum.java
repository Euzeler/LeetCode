public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        //又是递归，看来树的问题很多都是递归啊
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && root.val == targetSum){
            return true;
        }
        if(hasPathSum(root.left, targetSum - root.val) ||
        hasPathSum(root.right, targetSum - root.val)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        PathSum pathSum = new PathSum();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, null, null);
        TreeNode first = new TreeNode(1, second, third);
        boolean res = pathSum.hasPathSum(first, 3);
        System.out.println(res);
    }
}
