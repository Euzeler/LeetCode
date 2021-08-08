public class MinDepthOfBTree {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null && root.right != null){
            return Math.min(Integer.MAX_VALUE, rightDepth) + 1;
        }
        if(root.left != null && root.right == null){
            return Math.min(Integer.MAX_VALUE, leftDepth + 1);
        }
        //+1不能忘
        if(root.left != null && root.right != null) {
            return Math.min(leftDepth, rightDepth) + 1;
        }
        return 1;
    }

    //因为深度是必须到叶子节点的距离，因此使用深度遍历时，
    // 不能单纯的比较左右子树的递归结果返回较小值，
    // 因为对于有单个孩子为空的节点，为空的孩子会返回0，
    // 但这个节点并非叶子节点，故返回的结果是错误的。
    // 因此，当发现当前处理的节点有单个孩子是空时，
    // 返回一个极大值INT_MAX，防止其干扰结果。

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
