public class LowCommonAncestorOfBTree {
    //递归的时候，要把这句话放在外面，因为递归其实就是一整个函数在做循环，
    TreeNode ret = new TreeNode();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        //这是一颗二叉搜索树，
        //树一般用递归，
        //这个问题里面，根节点一定是，然后，左一定比根小，这样的话，可以利用p,q来找，
        //

        if(root.val == p.val || root.val == q.val ||
                (root.val > p.val && root.val < q.val) ||
                (root.val < p.val && root.val > q.val)){
            ret = root;
            return ret;
        }
        else if(root.val > p.val && root.val > q.val){
            lowestCommonAncestor(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val){
            lowestCommonAncestor(root.right, p, q);
        }
        return ret;
    }

    public static void main(String[] args){
        LowCommonAncestorOfBTree lowCommonAncestorOfBTree =
                new LowCommonAncestorOfBTree();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(1, null, null);
        TreeNode first = new TreeNode(2, second, third);
        TreeNode ret = lowCommonAncestorOfBTree.lowestCommonAncestor(first, third, second);
        System.out.println(ret.val);
    }
}
