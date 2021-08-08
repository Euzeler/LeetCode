public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
        
        return index;
    }

    public static void main(String[] args){
        RemoveElement r = new RemoveElement();
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = r.removeElement(nums, val);
        System.out.println("result = " + result);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}



