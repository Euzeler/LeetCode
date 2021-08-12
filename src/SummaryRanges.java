import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums){
        List<String> ret = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int I = i;
            int J = i;
            for(int j = I; j < nums.length; j++){
                if(nums[j] - nums[i] == j - i){
                    J = nums[j];
                }
                else{
                    break;
                }
            }
            System.out.println(J);
            if(J != nums[I]){
                ret.add(Integer.toString(nums[I]) + "->" +
                        Integer.toString(J));
                i += J - nums[I] + 1;
            }
            else if(J == nums[I]){
                ret.add(Integer.toString(J));
                i++;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> ret = summaryRanges.summaryRanges(nums);
        System.out.println(ret);
    }
}
