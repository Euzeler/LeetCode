public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val){
        //树用递归，利用BST的性质
        if(root == null) return null;
        if(root.val == val){
            return root;
        }
        else if (root.val < val){
            return searchBST(root.right, val);
        }
        else {
            return searchBST(root.left, val);
        }
    }

    public static void main(String[] args){
        SearchInABinarySearchTree se = new SearchInABinarySearchTree();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode third = new TreeNode(7, null, null);
        TreeNode first = new TreeNode(4, second, third);
        TreeNode ret = se.searchBST(first, 2);
        System.out.println(ret.val);
    }
}
