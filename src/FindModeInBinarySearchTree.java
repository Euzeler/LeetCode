import java.util.*;

public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root){

        //二叉搜索树，可以相等。递归，利用搜索树的特性。
        //属于是混起来了，把递归和对hashmap的数据的处理分开来。

        HashMap<Integer, Integer> hashMap = new HashMap();

        List<Integer> ret = new ArrayList<>();

        findMode(root, hashMap);

        List<Integer> value = new ArrayList<>();
        for(Integer v: hashMap.values()){
            value.add(v);
        }
        int[] value1 = new int[value.size()];
        for(int i = 0; i < value1.length; i++){
            value1[i] = value.get(i);
        }
        Arrays.sort(value1);

        for(Integer key : hashMap.keySet()){
            if(hashMap.get(key) == value1[value1.length - 1]){
                ret.add(key);
            }
        }

        int[] ret1 = new int[ret.size()];
        for(int i = 0; i < ret1.length; i++){
            ret1[i] = ret.get(i);
        }

        return ret1;
    }

    //那这个递归返回的是啥子嘞
    //用void
    public void findMode(TreeNode root, HashMap<Integer, Integer> hashMap){
        if(root == null) return;

        if(!hashMap.containsKey(root.val)){
            hashMap.put(root.val, 1);
        }
        else{
            hashMap.put(root.val, hashMap.get(root.val) + 1);
        }

        //啊呀，这个地方用错函数了呀，所以函数名字不要取得一样啊。
        findMode(root.left, hashMap);
        findMode(root.right, hashMap);
    }

    public static void main(String[] args){
        FindModeInBinarySearchTree f = new FindModeInBinarySearchTree();
        TreeNode third = new TreeNode(2, null, null);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode first = new TreeNode(1, null, second);
        int[] ret = f.findMode(first);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
