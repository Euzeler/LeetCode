public class RectangleOverlap_836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2){
        //也就是说有相交的
        //四个顶点都不在rec1的范围里面
        if(rec2[0] > rec1[0] && rec2[0] < rec1[2] && rec2[1] > rec1[1] && rec2[1] < rec1[3]){
            return true;
        }
        if(rec2[2] > rec1[0] && rec2[2] < rec1[2] && rec2[3] > rec1[1] && rec2[3] < rec1[3]){
            return true;
        }
        if(rec2[0] > rec1[0] && rec2[0] < rec1[2] && rec2[3] > rec1[1] && rec2[3] < rec1[3]){
            return true;
        }
        if(rec2[2] > rec1[0] && rec2[2] < rec1[2] && rec2[1] > rec1[1] && rec2[1] < rec1[3]){
            return true;
        }
        if(rec2[0] > rec1[0] && rec2[0] < rec1[2] && rec2[3] >= rec1[3]){
            return true;
        }
        //这样枚举不是一个头啊，
        return false;
    }

    public static void main(String[] args){
        int[] rec1 = {4,4,14,7};
        int[] rec2 = {4,3,8,8};
        RectangleOverlap_836 re = new RectangleOverlap_836();
        boolean ret = re.isRectangleOverlap(rec1, rec2);
        System.out.println(ret);
    }
}
