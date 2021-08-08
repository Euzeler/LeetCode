public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        //p != null && q != null这个条件忘记加了
        if(p != null && q != null &&
        p.val == q.val && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        SameTree sameTree = new SameTree();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, null, null);
        TreeNode first = new TreeNode(1, second, third);
        TreeNode third1 = new TreeNode(3, null, null);
        TreeNode second1 = new TreeNode(2, null, null);
        TreeNode first1 = new TreeNode(1, second1, third1);
        Boolean res = sameTree.isSameTree(first, first1);
        System.out.println(res);
    }
}
