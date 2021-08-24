import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2){
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            hashMap.put(list1[i], i);
        }

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        for(int i = 0; i < list2.length; i++){
            //一开始这里写错了
            hashMap1.put(list2[i], i);
        }

        int count = Integer.MAX_VALUE;
        for(String key : hashMap.keySet()){
            if(hashMap1.containsKey(key)){
                count = Math.min(count, hashMap.get(key) + hashMap1.get(key));
            }
        }

        List<String> ret = new ArrayList<>();

        for(String key : hashMap.keySet()){
            if(hashMap1.containsKey(key) && hashMap.get(key) + hashMap1.get(key) == count){
                ret.add(key);
            }
        }

        String[] ret1 = new String[ret.size()];

        for(int i = 0; i < ret.size(); i++){
            ret1[i] = ret.get(i);
        }

        return ret1;
    }

    public static void main(String[] args){
        MinimumIndexSumOfTwoLists mini = new MinimumIndexSumOfTwoLists();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] ret = mini.findRestaurant(list1, list2);
        for(int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }
}
