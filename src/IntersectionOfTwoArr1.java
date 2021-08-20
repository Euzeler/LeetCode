import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArr1 {
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            hashSet.add(nums1[i]);
        }
        List<Integer> ret = new LinkedList<>();
        for(int i = 0; i < nums2.length; i++){
            if(hashSet.contains(nums2[i])){
                hashSet.remove(nums2[i]);
                ret.add(nums2[i]);
            }
        }
        int[] ret1 = new int[ret.size()];
        for(int i = 0; i < ret.size(); i++){
            ret1[i] = ret.get(i);
        }
        return ret1;
    }

    public static void main(String[] args){
        IntersectionOfTwoArr1 in = new IntersectionOfTwoArr1();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ret = in.intersection(nums1, nums2);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
        //HashSet集合不允许有重复的元素，这个方法正是利用了这一点。



    }
}
