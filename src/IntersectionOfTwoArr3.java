import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArr3 {
    public int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(!hashMap.containsKey(nums1[i])){
                hashMap.put(nums1[i], 1);
            }
            else{
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            }
        }
        List<Integer> ret = new LinkedList<>();
        for(int i = 0; i < nums2.length; i++){
            if(hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) > 0){
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
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
        IntersectionOfTwoArr3 in = new IntersectionOfTwoArr3();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ret = in.intersect(nums1, nums2);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
