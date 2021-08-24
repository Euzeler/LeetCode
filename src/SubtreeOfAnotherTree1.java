import java.util.ArrayList;
import java.util.List;

public class SubtreeOfAnotherTree1 {
    //首先是要做到答案是对的，然后再加速。
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        //树用递归,前序遍历到一个数组里面，比较是不是字数组就可以了
        if(root == subRoot) return true;
        else{
            StringBuilder retRoot = new StringBuilder();
            StringBuilder retSubRoot = new StringBuilder();
            preOrder(root, retRoot);
            preOrder(subRoot, retSubRoot);
            String retRoot1 = retRoot.toString();
            String retSubRoot1 = retSubRoot.toString();
            //return retRoot1.indexOf(retSubRoot1) >= 0;
            return retRoot1.contains(retSubRoot1);
        }
    }

    public void preOrder(TreeNode root, StringBuilder ret){
        if(root == null) {
            ret.append("null");
            return;
        }

        ret.append("#" + root.val);
        preOrder(root.left, ret);
        preOrder(root.right, ret);

    }

    public static void main(String[] args){
        SubtreeOfAnotherTree1 sub = new SubtreeOfAnotherTree1();
        TreeNode fifth = new TreeNode(3, null, null);
        TreeNode forth = new TreeNode(1, null, null);
        TreeNode third = new TreeNode(5, null, null);
        TreeNode second = new TreeNode(4, forth, fifth);
        TreeNode first = new TreeNode(3, second, third);
        boolean ret = sub.isSubtree(first, second);
        System.out.println(ret);

//        String a = "3454120";
//        String b = "412";
//        System.out.println("测试isSubString: " + sub.isSubString(a, b));
    }
}
