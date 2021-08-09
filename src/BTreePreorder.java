import java.util.ArrayList;
import java.util.List;

public class BTreePreorder {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root){
        //这句话的位置放错了呀，每次递归都会重新创建一个list
        // List<Integer> res = new ArrayList<>();
        if(root != null){
            res.add(root.val);
            if(root.left != null){
                preorderTraversal(root.left);
            }
            if(root.right != null){
                preorderTraversal(root.right);
            }
        }
        return res;
    }

//    List<Integer> traversal = new ArrayList<>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//        if(root!=null){helper(root);}
//        return traversal;
//    }
//
//    void helper (TreeNode root){
//        traversal.add(root.val);
//        if(root.left!=null){helper(root.left);}
//        if(root.right!=null){helper(root.right);}
//    }

    public static void main(String[] args){
        BTreePreorder bTreePreorder = new BTreePreorder();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode first = new TreeNode(1, null, second);
        List<Integer> res = bTreePreorder.preorderTraversal(first);
        System.out.println(res);
    }
}
