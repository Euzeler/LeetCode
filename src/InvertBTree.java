public class InvertBTree {
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args){
        InvertBTree invertBTree = new InvertBTree();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(1, null, null);
        TreeNode first = new TreeNode(2, second, third);
        TreeNode ret = invertBTree.invertTree(first);
        System.out.println(ret.left.val);
    }
}
