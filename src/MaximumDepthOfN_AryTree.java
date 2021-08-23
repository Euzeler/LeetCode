import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfN_AryTree {
    //递归，深度，

    public int maxDepth(NodeTree root){
        if(root == null) return 0;

        //根本就没递归啊，
        int max = 1;
        //一样的意思，就是不成功。
//        if(root.children != null){
//            for(int i = 0; i < root.children.size(); i++){
//                max = Math.max(max, 1 + maxDepth(root.children.get(i)));
//            }
//        }

        for(NodeTree node : root.children){
            max = Math.max(max, 1 + maxDepth(node));
        }
        return max;
    }

    public static void main(String[] args){
        //难道是我的测试用例写错了，明早再看看吧。
        MaximumDepthOfN_AryTree m = new MaximumDepthOfN_AryTree();
        NodeTree fifth = new NodeTree(5);
        NodeTree sixth = new NodeTree(6);
        List<NodeTree> thirdList = new ArrayList<>();
        thirdList.add(fifth);
        thirdList.add(sixth);
        NodeTree third = new NodeTree(3, thirdList);
        NodeTree second = new NodeTree(2);
        NodeTree forth = new NodeTree(4);
        List<NodeTree> firstList = new ArrayList<>();
        thirdList.add(third);
        thirdList.add(second);
        thirdList.add(forth);
        NodeTree first = new NodeTree(1, firstList);
        int ret = m.maxDepth(first);
        System.out.println(ret);

    }
}

class NodeTree {
    public int val;
    public List<NodeTree> children;

    public NodeTree() {}

    public NodeTree(int _val) {
        val = _val;
    }

    public NodeTree(int _val, List<NodeTree> _children) {
        val = _val;
        children = _children;
    }
};
