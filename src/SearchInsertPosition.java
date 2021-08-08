import java.util.HashMap;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        int i = 0;
        int res = 0;

        while(i < nums.length){
            if(nums[i] < target){
                i++;
            }
            else {
                break;
            }
        }
        res = i;
        return res;
    }

    public static void main(String[] args){
        SearchInsertPosition s = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int res = 0;
        res = s.searchInsert(nums, 7);
        System.out.println(res);
    }
}
