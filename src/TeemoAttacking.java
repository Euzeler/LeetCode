public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration){
        int ret = 0;
        for(int i = 0; i < timeSeries.length - 1; i++){
            //没有重复
            if(timeSeries[i + 1] - timeSeries[i] >= duration){
                ret += duration;
            }
            //有重复
            else{
                ret += timeSeries[i + 1] - timeSeries[i];
            }
        }
        //最后一个
        ret += duration;
        return ret;
    }

    public static void main(String[] args){
        int[] timeSeries = {1,4};
        int duration = 2;
        TeemoAttacking t = new TeemoAttacking();
        int ret = t.findPoisonedDuration(timeSeries, duration);
        System.out.println(ret);
    }
}
