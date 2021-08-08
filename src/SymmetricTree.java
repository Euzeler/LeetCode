public class SymmetricTree {
    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        if(isSymmetrical(root.right, root.left)){
            return true;
        }
        return false;
    }

    public boolean isSymmetrical(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val &&
        isSymmetrical(root1.left, root2.right) &&
        isSymmetrical(root1.right, root2.left)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        SymmetricTree symmetricTree = new SymmetricTree();
        TreeNode third = new TreeNode(2, null, null);
        TreeNode second = new TreeNode(2, null, null);
        TreeNode first = new TreeNode(1, second, third);
        Boolean res = symmetricTree.isSymmetric(first);
        System.out.println(res);
    }
}
