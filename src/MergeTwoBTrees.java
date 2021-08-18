public class MergeTwoBTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        //树一般用递归，这里肯定要new了吧，也不一定，嫁接就好了，
        //以root1为存储，如果root2有值，就加过来，如果root1没有，就嫁接。
        if(root1 == null && root2 == null){
            return null;
        }

        if(root1 != null && root2 != null){
            root1.val = root1.val + root2.val;
        }

        //嫁接
        if(root1.left == null && root2.left != null){
            root1.left = root2.left;
        }

        if(root1.right == null && root2.right != null){
            root1.right = root2.right;
        }

        mergeTrees(root1.left, root2.left);
        mergeTrees(root1.right, root2.right);

        return root1;
    }

    public static void main(String[] args){
        TreeNode forth = new TreeNode(5, null, null);
        TreeNode third = new TreeNode(2, null, null);
        TreeNode second = new TreeNode(3, forth, null);
        TreeNode first = new TreeNode(1, second, third);

        TreeNode fifth1 = new TreeNode(7, null, null);
        TreeNode forth1 = new TreeNode(4, null, null);
        TreeNode third1 = new TreeNode(3, null, fifth1);
        TreeNode second1 = new TreeNode(1, null, forth1);
        TreeNode first1 = new TreeNode(2, second1, third1);

        MergeTwoBTrees m = new MergeTwoBTrees();
        TreeNode ret = m.mergeTrees(first, first1);
        System.out.println(ret.val);
    }
}
