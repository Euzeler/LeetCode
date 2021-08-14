import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    List<String> ret = new LinkedList<>();
    StringBuilder s = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root){
        //和List<String> ret = new ArrayList<>();一样的结果
        //遇到的还是递归的问题，就是递归的时候，new写在外面，
        //有方法写在里面的，
        //Debug之后，发现和正确的方法遍历的过程是一样的，问题出现在记录这一步上
        //if(root == null) return ret;

        if(root.left == null && root.right == null){
            s.append(root.val);
            ret.add(s.toString());
            //错误就在这里了，改成return
            s = new StringBuilder();

            return ret;
        }
        //难道是if条件出了问题，


            s.append(root.val + "->");
            binaryTreePaths(root.left);


//            s = new StringBuilder();
            s.append(root.val + "->");
            binaryTreePaths(root.right);

        return ret;
    }

    public static void main(String[] args){
        TreeNode sixth = new TreeNode(6, null, null);
        TreeNode forth = new TreeNode(5, null, null);
        TreeNode third = new TreeNode(3, null, null);
        TreeNode second = new TreeNode(2, forth, sixth);
        TreeNode first = new TreeNode(1, second, third);
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        List<String> ret = binaryTreePaths.binaryTreePaths(first);
        System.out.println(ret);
    }
}
