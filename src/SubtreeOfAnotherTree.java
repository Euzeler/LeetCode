import java.util.ArrayList;
import java.util.List;

public class SubtreeOfAnotherTree {
    //首先是要做到答案是对的，然后再加速。
    StringBuilder ret = new StringBuilder();
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        //树用递归,前序遍历到一个数组里面，比较是不是字数组就可以了
        if(root == subRoot) return true;
        else{
            String retRoot = preOrder(root);
            String tmp = preOrder(subRoot);
            char[] tmp1 = tmp.toCharArray();
            String retSubRoot = String.copyValueOf(tmp1, retRoot.length(), tmp.length() - retRoot.length());
            System.out.println(retRoot);
            System.out.println(retSubRoot);
//            return isSubString(retRoot, retSubRoot);
            return retRoot.indexOf(retSubRoot) >= 0;
        }
    }

    public String preOrder(TreeNode root){

        if(root == null) {
            //树的遍历，要加进这两个，才能区分是不是同一颗树
            ret.append("null");
            return ret.toString();
        }
        ret.append("#" + root.val);

        preOrder(root.left);
        preOrder(root.right);

        return ret.toString();
    }

    public boolean isSubString(String total, String sub){
        for(int i = 0; i < total.length(); i++){
            if(total.charAt(i) == sub.charAt(0)){
                for(int j = 0; j < sub.length(); j++){
                    if(total.charAt(i + j) == sub.charAt(j)){
                        if(j == sub.length() - 1){
                            return true;
                        }
                        else {
                            continue;
                        }
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        SubtreeOfAnotherTree sub = new SubtreeOfAnotherTree();
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
