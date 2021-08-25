import java.util.HashSet;

public class TwoSumIV_InputIsABST {
    HashSet<Integer> hashSet = new HashSet<>();
    public boolean findTarget(TreeNode root, int k){
        //利用BST的特性做
//        if(root.val == k - root.val) return false;
//
//        else if(root.left.val == k - root.val) return true;
//
//        else if(root.val > k - root.val) {
//            findTarget(root.left, k - root.val);
//        }
//
//        else if(root.val < k - root.val){
//            findTarget(root.right, k - root.val);
//        }
        if(root == null) return false;

        else if(hashSet.contains(k - root.val)) return true;

        hashSet.add(root.val);

        return findTarget(root.left, k) || findTarget(root.right, k);

    }

    public static void main(String[] args){
        TwoSumIV_InputIsABST two = new TwoSumIV_InputIsABST();
        TreeNode sixth = new TreeNode(7, null, null);
        TreeNode fifth = new TreeNode(4, null, null);
        TreeNode forth = new TreeNode(2, null, null);
        TreeNode third = new TreeNode(6, null, sixth);
        TreeNode second = new TreeNode(3, forth, fifth);
        TreeNode first = new TreeNode(5, second, third);
        boolean ret = two.findTarget(first, 9);
        System.out.println(ret);
    }
}
