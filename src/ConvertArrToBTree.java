import sun.reflect.generics.tree.Tree;

public class ConvertArrToBTree {
    public TreeNode sortedArrayToBST(int[] nums){
        //递归，BST就是左右子树的深度之差不能超过1
        if(nums == null || nums.length == 0){
            return null;
        }
        int mid = nums.length / 2;
        int[] leftNums = new int[mid];
        int[] rightNums = new int[nums.length - mid - 1];
        for(int i = 0; i < leftNums.length; i++){
            leftNums[i] = nums[i];
        }
        for(int i = 0; i < rightNums.length; i++){
            rightNums[i] = nums[i + mid + 1];
        }
        TreeNode res = new TreeNode(nums[mid]);
        res.left = sortedArrayToBST(leftNums);
        res.right = sortedArrayToBST(rightNums);
        return res;
    }

    public static void main(String[] args){
        ConvertArrToBTree convertArrToBTree = new ConvertArrToBTree();
        int[] arr = {-10, -3, 0, 5, 9};
        TreeNode res = convertArrToBTree.sortedArrayToBST(arr);
        System.out.println(res.left.val);
    }
}
