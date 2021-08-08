public class MinDepthOfBTree1 {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0){
            return left + right + 1;
        }
        else if(left < right){
            return left + 1;
        }
        else return right + 1;
    }

    public static void main(String[] args){
        MinDepthOfBTree minDepthOfBTree = new MinDepthOfBTree();
        TreeNode fifth = new TreeNode(7, null, null);
        TreeNode forth = new TreeNode(15, null, null);
        TreeNode third = new TreeNode(20, forth, fifth);
        TreeNode second = new TreeNode(9, null, null);
        TreeNode first = new TreeNode(3, second, third);
        int res = minDepthOfBTree.minDepth(first);
        System.out.println(res);
    }
}
