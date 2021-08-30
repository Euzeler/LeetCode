public class Minimum783_1 {
    int min = Integer.MAX_VALUE;
    Integer prev;
    public int minDiffInBST(TreeNode root){
        //那就还是说每一个节点要和所有的子孙节点去比较啊，[90,69,null,49,89,null,52]，i got it，尝试用中序遍历来做
        if(root == null) return 0;

        minDiffInBST(root.left);
        if(prev != null) {
            int curr = root.val;
            min = Math.min(min, curr - prev);
        }
        prev = root.val;

        minDiffInBST(root.right);

        return min;
    }

    //先写一个中序遍历吧，
    public void midOrder(TreeNode root){
        if(root == null) return;
        midOrder(root.left);
        System.out.println("midOrder Test: " + root.val);
        midOrder(root.right);
    }

    public static void main(String[] args){
        Minimum783_1 minimum783 = new Minimum783_1();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode second = new TreeNode(2, forth, fifth);
        TreeNode third = new TreeNode(6, null, null);
        TreeNode first = new TreeNode(4, second, third);
        minimum783.midOrder(first);
        int ret = minimum783.minDiffInBST(first);
        System.out.println(ret);
    }
}
