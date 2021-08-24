import java.util.ArrayList;
import java.util.List;

//树有点儿不熟练，明天再看 637
public class AverageOfLevelsInBinaryTree {
    List<Sum> list = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        helper(root, 0);
        List<Double> l = new ArrayList<>();
        for(Sum s: list){
            l.add(s.sum / s.size);
        }
        return l;
    }
    private void helper(TreeNode node, int level){
        if(node == null)
            return;
        if(list.size() == level){
            list.add(new Sum(node.val, 1));
        }
        else{
            Sum s = list.get(level);
            s.sum += node.val;
            s.size++;
        }
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }

    class Sum{
        protected double sum;
        protected int size;

        public Sum(int sum, int size){
            this.sum = sum;
            this.size = size;
        }
    }

    public static void main(String[] args){
        AverageOfLevelsInBinaryTree a = new AverageOfLevelsInBinaryTree();
        TreeNode fifth = new TreeNode(7, null, null);
        TreeNode forth = new TreeNode(15, null, null);
        TreeNode third = new TreeNode(20, forth, fifth);
        TreeNode second = new TreeNode(9, null, null);
        TreeNode first = new TreeNode(3, second, third);
        List<Double> ret = a.averageOfLevels(first);
        System.out.println(ret);
    }
}

