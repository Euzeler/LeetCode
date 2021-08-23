import java.util.Arrays;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score){
        int[] tmp = new int[score.length];
        for(int i = 0; i < tmp.length; i++){
            tmp[i] = score[i];
        }
        Arrays.sort(score);
        String[] ret = new String[score.length];
        for(int i = 0; i < tmp.length; i++){
            int rank = tmp.length - binarySearch(score, tmp[i]);
            if(rank == 1){
                ret[i] = "Gold Medal";
            }
            else if(rank == 2){
                ret[i] = "Silver Medal";
            }
            else if(rank == 3){
                ret[i] = "Bronze Medal";
            }
            else{
                ret[i] = Integer.toString(rank);
            }
        }

        return ret;
    }

    public int binarySearch(int[] score, int target){
        int ret = 0;
        //Arrays.sort(score);假设score已经是排序了的，升序
        int l = 0, r = score.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(score[mid] == target){
                return mid;
            }
            if(score[mid] < target){
                l = mid + 1;
            }
            else if(score[mid] > target){
                r = mid - 1;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        RelativeRanks r = new RelativeRanks();
        int[] score = {5,4,3,2,1};
        String[] ret = r.findRelativeRanks(score);
        for(int i = 0; i < ret.length; i++){
            System.out.println(ret[i]);
        }
    }
}
