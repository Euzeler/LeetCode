public class ExcelSheet1 {
    public int titleToNumber(String columnTitle){
        int ret = 0;
        int n = 1;
        for(int i = columnTitle.length() - 1; i >= 0; i--){
            ret += (columnTitle.charAt(i) - 64) * n;
            n *= 26;
        }
        return ret;
    }

    public static void main(String[] args){
        ExcelSheet1 excelSheet1 = new ExcelSheet1();
        String s = "AB";
        int ret = excelSheet1.titleToNumber(s);
        System.out.println(ret);
    }
}
