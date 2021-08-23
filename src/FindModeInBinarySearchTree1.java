import javax.swing.plaf.basic.BasicMenuUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindModeInBinarySearchTree1 {
    //改进，在加入hashMap的过程中，把最大值判断出来
    int maxValue = 0;
    public int[] findMode(TreeNode root){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        findModeRecursive(root, hashMap);
        //这人聪明啊，最多不会超过map.size()
        int[] ret = new int[hashMap.size()];
        int idx = 0;
        for(Integer key : hashMap.keySet()){
            if(hashMap.get(key) == maxValue){
                ret[idx++] = key;
            }
        }
        return Arrays.copyOf(ret, idx);
    }

    //那这个递归返回的是啥子嘞
    //用void
    public void findModeRecursive(TreeNode root, HashMap<Integer, Integer> hashMap){
        if(root == null) return;
        if(hashMap.containsKey(root.val)){
            hashMap.put(root.val, hashMap.get(root.val) + 1);
            if(hashMap.get(root.val) > maxValue){
                //不要耍小聪明，该怎样就怎样。
                maxValue = hashMap.get(root.val);
            }
        }
        else{
            hashMap.put(root.val, 1);
            maxValue = Math.max(maxValue, 1);
        }

        findModeRecursive(root.left, hashMap);
        findModeRecursive(root.right, hashMap);
    }

    public static void main(String[] args){
        FindModeInBinarySearchTree1 f = new FindModeInBinarySearchTree1();
        TreeNode third = new TreeNode(2, null, null);
        TreeNode second = new TreeNode(2, third, null);
        TreeNode first = new TreeNode(1, null, second);
//        TreeNode first = new TreeNode(0, null, null);
        int[] ret = f.findMode(first);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }

//        int[] ceshi = {1,2,3,4,5};
//        int[] ceshi1 = Arrays.copyOf(ceshi, 4);
//        for(int i = 0; i < ceshi1.length; i++){
//            System.out.println(ceshi1[i]);
//        }
    }
}
