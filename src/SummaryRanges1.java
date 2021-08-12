import java.util.ArrayList;
import java.util.List;

public class SummaryRanges1 {
    public List<String> summaryRanges(int[] nums){
        //这个方法比我快的理由是它只用了一重循环，而我用了两重循环
        List<String> ret = new ArrayList<>();
        if(nums == null || nums.length < 1){
            return ret;
        }
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(i + 1 < nums.length && Math.abs(nums[i] - nums[i + 1]) == 1){
                continue;
            }
            else{
                if(min == nums[i]){
                    ret.add(Integer.toString(nums[i]));
                }
                else{
                    ret.add(min + "->" + nums[i]);
                }
                if(i + 1 < nums.length) {
                    min = nums[i + 1];
                }
            }
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges1 summaryRanges = new SummaryRanges1();
        List<String> ret = summaryRanges.summaryRanges(nums);
        System.out.println(ret);
    }
}
