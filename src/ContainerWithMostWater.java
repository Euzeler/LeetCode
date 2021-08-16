public class ContainerWithMostWater {
    public int maxArea(int[] height){
        //用i, j 指针做，难以实现，直接双重循环做，
        //通过了56个测试用例，还剩四个，复杂度太高了
//        int max = 0;
//        for(int i = 0; i < height.length; i++){
//            for(int j = i; j < height.length; j++){
//                if((j - i) * Math.min(height[i], height[j]) > max){
//                    max = (j - i) * Math.min(height[i], height[j]);
//                }
//            }
//        }

        //还是用双指针做，但是不一定都从0开始啊，从头和尾开始
        int left = 0, right = height.length - 1;
        int max = 0;
        while(left < right){
            max = Math.max((right - left) * Math.min(height[left], height[right]), max);
            if(height[left] < height[right]){
                left++;
            }
            else if(height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        //果然，双重循环导致代码过长，
        ContainerWithMostWater c = new ContainerWithMostWater();
        int ret = c.maxArea(height);
        System.out.println(ret);
    }
}
