public class RectangleOverlap_836_1 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2){
        //也就是说有相交的
        //四个顶点都不在rec1的范围里面
        if(rec2[2] <= rec1[0]) return false;
        if(rec2[0] >= rec1[2]) return false;
        if(rec2[1] >= rec1[3]) return false;
        if(rec2[3] <= rec1[1]) return false;
        return true;
    }

    public static void main(String[] args){
        int[] rec1 = {4,4,14,7};
        int[] rec2 = {4,3,8,8};
        RectangleOverlap_836_1 re = new RectangleOverlap_836_1();
        boolean ret = re.isRectangleOverlap(rec1, rec2);
        System.out.println(ret);
    }
}
