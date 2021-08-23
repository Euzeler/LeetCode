public class MinimumAbsoluteDifferenceInBST1 {
    int min = Integer.MAX_VALUE;
    //int pre;这样就会出问题，
    //而这样就不会,聪明啊
    Integer pre;
    public int getMinimumDifference(TreeNode root){
        inorder(root);
        return min;
    }

    private void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        if(pre != null){
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        inorder(root.right);
    }

    //以下为中序遍历的复习部分。
    StringBuilder s = new StringBuilder();
    private String inorderReview(TreeNode root){
        if(root == null) return null;

        inorderReview(root.left);
        s.append(root.val);
        inorderReview(root.right);
        return s.toString();
    }

    public static void main(String[] args){
        MinimumAbsoluteDifferenceInBST1 m = new MinimumAbsoluteDifferenceInBST1();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode third = new TreeNode(6, null, null);
        TreeNode first = new TreeNode(4, second, third);
        int ret = m.getMinimumDifference(first);
        System.out.println(ret);

        String ceshi = m.inorderReview(first);
        System.out.println(ceshi);
    }
}
