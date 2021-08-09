import java.util.ArrayList;
import java.util.List;

public class BTreePostorder {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root){
        if(root != null){
            //后序遍历是左，右，中；
            //前序就是正常的顺序，中，左，右
            //中序是左，中，右
            //看中间在哪一个顺序遍历，永远都是先左后右
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
        }
        return res;
    }

    public static void main(String[] args){
        BTreePostorder bTreePostorder = new BTreePostorder();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode first = new TreeNode(1, null, second);
        List<Integer> res = bTreePostorder.postorderTraversal(first);
        System.out.println(res);
    }
}
