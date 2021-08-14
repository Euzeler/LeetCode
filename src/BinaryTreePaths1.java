import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths1 {
    //这个好理解，哈哈，总能够找到的。
    List<String> res = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root){
        if(root == null) return res;
        doAtThisNode(root, "");
        return res;
    }

    private void doAtThisNode(TreeNode thisNode, String parentPath){
        String currentPath;
        if(parentPath != ""){
            currentPath = parentPath + "->" + thisNode.val;
        }
        else{
            currentPath = Integer.toString(thisNode.val);
        }

        if(thisNode.left != null){
            doAtThisNode(thisNode.left, currentPath);
        }
        if(thisNode.right != null){
            doAtThisNode(thisNode.right, currentPath);
        }
        if(thisNode.left == null && thisNode.right == null){
            res.add(currentPath);
        }
    }

    public static void main(String[] args){
        TreeNode sixth = new TreeNode(6, null, null);
        TreeNode forth = new TreeNode(5, null, null);
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, forth, sixth);
        TreeNode first = new TreeNode(1, second, third);
        BinaryTreePaths1 binaryTreePaths = new BinaryTreePaths1();
        List<String> ret = binaryTreePaths.binaryTreePaths(first);
        System.out.println(ret);
    }
}
