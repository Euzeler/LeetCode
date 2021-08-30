public class Minimum783 {
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root){
        //那就还是说每一个节点要和所有的子孙节点去比较啊，[90,69,null,49,89,null,52]，i got it，尝试用前序遍历来做
        if(root == null || (root.left == null && root.right == null)) return min;
        if(root.left != null && root.right != null) {
            min = Math.min(min, Math.min(root.val - root.left.val, root.right.val - root.val));
        }
        else if(root.left != null){
            min = Math.min(min, root.val - root.left.val);
        }
        else if(root.right != null){
            min = Math.min(min, root.right.val - root.val);
        }
        return Math.min(minDiffInBST(root.left), minDiffInBST(root.right));
    }

    public static void main(String[] args){
        Minimum783 minimum783 = new Minimum783();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode third = new TreeNode(6, null, null);
        TreeNode first = new TreeNode(4, second, third);
        int ret = minimum783.minDiffInBST(first);
        System.out.println(ret);
    }
}
