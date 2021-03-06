public class MaximumAverageSubarray1 {
    public double findMaxAverage(int[] nums, int k){
        if(nums.length == 1) return (double) nums[0] / k;
        //这个要用这个，不能用Double.MIN_VALUE，现在只是时间不够，那么明天看怎么解决
        //用负无穷，
//        double ret = Double.NEGATIVE_INFINITY;
//        //i是起点
//        for(int i = 0; i < nums.length - k + 1; i++){
//            double tmp = 0;
//            //二重循环
//            for(int j = i; j < i + k; j++){
//                //这么一点也要优化啊，就这么一点加法，优化了一半的加法掉。
//                tmp += nums[j];
//            }
//            ret = Math.max(ret, tmp);
//        }
//        Double ret1 = (Double)(ret / k);
//        return ret1;

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int max = sum;
        int p = 0, q = k;
        //条件

        //因为第一次已经算掉了，所以需要这么多次，这样写更容易理解
        for(int i = 1; i < nums.length - k + 1; i++){
            sum += (nums[q++] - nums[p++]);
            if(max < sum) max = sum;
        }
        return (double)max / k;

        //把除法移到外面来，还是太慢，无法通过测试用例，
        //以上的方法太慢，通过不了测试用例，

    }

    public static void main(String[] args){
        MaximumAverageSubarray1 max = new MaximumAverageSubarray1();
        int[] nums = {8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,-4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,-1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,-4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891};
        int k = 93;
        double ret = max.findMaxAverage(nums, k);
        System.out.println(ret);
        //奥，测试了就知道，这个不是最小的呀。
        System.out.println("测试： " + Double.MIN_VALUE);
        System.out.println("测试： " + Double.NEGATIVE_INFINITY);
    }
}
