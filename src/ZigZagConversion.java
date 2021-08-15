public class ZigZagConversion {
    public String convert(String s, int numRows){
        //蛇形走，然后横着读，
        //找规律直接输出，放进一个二维数组然后读取
        //参考的就是放进二维数组，然后再读取，用的是StringBuilder，
        //Nice，一遍过，重点是善于使用了StringBuffer，和StringBuilder是一样的，
        //脑子里一闪而过了StringBuilder，但是没有自信去使用。
        char[] c = s.toCharArray();

        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while(i < c.length){
            for(int idx = 0; idx < sb.length && i < c.length; idx++){
                sb[idx].append(c[i++]);
            }
            for(int idx = numRows - 2; idx >= 1 && i < c.length; idx--){
                sb[idx].append(c[i++]);
            }
        }
        for(int k = 1; k < numRows; k++){
            sb[0].append(sb[k]);
        }
        return sb[0].toString();
    }

    public static void main(String[] args){
        ZigZagConversion z = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String ret = z.convert(s, numRows);
        System.out.println(ret);
    }
}
