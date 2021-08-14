public class LowCommonAncestorOfBTree1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            //把return的语句放在最后，就可以不用去new一个TreeNode来存储了，
            //同时条件的判断要善于利用else，
            return root;
        }

        //最快的方法是这样的，思路都是一样的，递归，但是区别在于if条件的使用，
//        if(root == null){
//            return root;
//        }
//        if(p.val < root.val && q.val < root.val){
//            return lowestCommonAncestor(root.left, p, q);
//        }
//        if(p.val > root.val && q.val > root.val){
//            return lowestCommonAncestor(root.right, p, q);
//        }
//        return root;
    }

    public static void main(String[] args){
        LowCommonAncestorOfBTree1 lowCommonAncestorOfBTree =
                new LowCommonAncestorOfBTree1();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(1, null, null);
        TreeNode first = new TreeNode(2, second, third);
        TreeNode ret = lowCommonAncestorOfBTree.lowestCommonAncestor(first, third, second);
        System.out.println(ret.val);
    }
}
