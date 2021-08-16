import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums){
        //果然是sort一下，然后三个指针i, j, k
        //wow,就是把自己的零碎的思路结合起来，-nums[i]这个思路也要，
        //少了一个思路是j, k,从两边逼近
        List<List<Integer>> ret = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            //去掉相同的triplets，
            if(i > 0 && nums[i] == nums[i - 1]){
                i++;
            }
            //遍历的完整性是可以保证的
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                if(nums[j] + nums[k] == -nums[i]){
                        //难道是这里引发的超时，每次都要比较，如果原来的list里的东西多的话，确实可能超时
//                    if(!ret.contains(curr)) {
//                        ret.add(curr);
//                    }
                    //j--，k++，和j-1，k+1搞混了
                    if((k < nums.length - 1 && !(nums[j] == nums[j - 1] && nums[k] == nums[k + 1])) || k == nums.length - 1) {
                        List<Integer> curr = new LinkedList<>();
                        curr.add(nums[i]);
                        curr.add(nums[j]);
                        curr.add(nums[k]);

                        if(!ret.contains(curr)) {
                            ret.add(curr);
                        }
                    }
                        j++;
                        k--;

                    //可能两者都移动，也能达到相等，wow
                }
                else if(nums[j] + nums[k] > -nums[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        _3Sum _3sum = new _3Sum();
        List<List<Integer>> ret = _3sum.threeSum(nums);
        System.out.println(ret);
    }
}
