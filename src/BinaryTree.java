import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    List list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        //递归是有层次的，在最上层的返回就是遍历结束了
        //这是表示空节点直接返回的意思
        if(root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        //这是表示遍历结束返回的意思
        return list;
    }

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode first = new TreeNode(1, null, second);
        List list = binaryTree.inorderTraversal(first);
        System.out.println(list);
    }
}

