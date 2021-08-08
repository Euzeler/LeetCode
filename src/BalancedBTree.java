public class BalancedBTree {
    public boolean res = true;

    public boolean isBalanced(TreeNode root){
        height(root);
        return res;
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l - r) > 1) res = false;
        //写成这样，这个小错误就会导致错误啊，因为递归是耗时的，所以需要利用已经有的结果
        //减少递归
        //return Math.max(height(root.left), height(root.right)) + 1;
        return Math.max(l, r) + 1;
    }

    public static void main(String[] args){
        BalancedBTree balancedBTree = new BalancedBTree();
        TreeNode fifth = new TreeNode(7, null, null);
        TreeNode forth = new TreeNode(15, null, null);
        TreeNode third = new TreeNode(20, forth, fifth);
        TreeNode second = new TreeNode(9, null, null);
        TreeNode first = new TreeNode(3, second, third);
        boolean res = balancedBTree.isBalanced(first);
        System.out.println(res);
    }
}
