public class MinimumAbsoluteDifferenceInBST {
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root){
        //树用递归，利用二叉搜索树的特性，最小值只能出现在根与它的左子树的差，或者根与它的右子树
        //需要两种遍历。
        if(root == null || (root.left == null && root.right == null)) return min;

        TreeNode store = root;

        int tmp = Integer.MAX_VALUE;
        while(root.left != null || root.right != null){
            if(root.left != null){
                tmp = Math.min(tmp, Math.abs(root.val - root.left.val));
                root = root.left;
            }
            if(root.right != null){
                tmp = Math.min(tmp, Math.abs(root.val - root.right.val));
                root = root.right;
            }
        }

        min = Math.min(min, tmp);

        getMinimumDifference(store.left);
        getMinimumDifference(store.right);

        return min;
    }

    public static void main(String[] args){
        MinimumAbsoluteDifferenceInBST m = new MinimumAbsoluteDifferenceInBST();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode third = new TreeNode(6, null, null);
        TreeNode first = new TreeNode(4, second, third);
        int ret = m.getMinimumDifference(first);
        System.out.println(ret);
    }
}
