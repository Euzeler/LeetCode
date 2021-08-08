public class MaxDepthOfBTree {
    public int maxDepth(TreeNode root){
        //递归求解
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right != null){
            //+1忘记了
            return maxDepth(root.right) + 1;
        }
        if(root.right == null && root.left != null){
            return maxDepth(root.left) + 1;
        }
        if(root.right != null && root.left != null){
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
        //这个是题目特色，看深度是如何定义的
        return 1;
    }

    public static void main(String[] args){
        MaxDepthOfBTree maxDepthOfBTree = new MaxDepthOfBTree();
        TreeNode fifth = new TreeNode(7, null, null);
        TreeNode forth = new TreeNode(15, null, null);
        TreeNode third = new TreeNode(20, forth, fifth);
        TreeNode second = new TreeNode(9, null, null);
        TreeNode first = new TreeNode(3, second, third);
        int res = maxDepthOfBTree.maxDepth(first);
        System.out.println(res);
    }
}
