public class DiameterOfBTree {
    public int diameterOfBinaryTree(TreeNode root){
        //树一般用递归，递归里面包含递归。
        //思路是对的，只是没有勇气去做。
        if(root == null){
            return 0;
        }
        int ldi = diameterOfBinaryTree(root.left);
        int rdi = diameterOfBinaryTree(root.right);

        return Math.max(height(root.left) + height(root.right) + 2,
                Math.max(ldi, rdi));

    }

    private int height(TreeNode root){
        //我这个深度是有多少个点啊，成功。return 0的话
        //改成return -1，就是多少条边了。
        if(root == null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args){
        DiameterOfBTree d = new DiameterOfBTree();
        TreeNode sixth = new TreeNode(6, null, null);
        TreeNode fifth = new TreeNode(5, sixth, null);
        TreeNode forth = new TreeNode(4, null, null);
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode first = new TreeNode(1, second, third);
//        int ret = d.height(first);
        int ret = d.diameterOfBinaryTree(first);
        System.out.println(ret);
    }
}
