public class ExcelSheet {
    public String convertToTitle(int columnNumber){
//        StringBuilder res = new StringBuilder();
//        int tmp = 0;
//        while (columnNumber > 26){
//            tmp = columnNumber % 26;
//            res.insert(0, (char)(tmp + 64));
//            columnNumber /= 26;
//        }
//        res.insert(0, (char)(columnNumber + 64));
//        String res1 = res.toString();
//        return res1;

        StringBuilder res = new StringBuilder();
        int tmp = 0;
        while (columnNumber > 0){
            //这里和tmp + 65配合使用，解决的是 52 的问题，这一串字母里面不能有0.
            //那我就先减1，再加1.因为是两句话都循环，所以一减一加就抵消掉了
            columnNumber--;
            tmp = columnNumber % 26;
            res.insert(0, (char)(tmp + 65));
            columnNumber /= 26;
        }
//        res.insert(0, (char)(columnNumber + 64));
        String res1 = res.toString();
        return res1;
    }

    public static void main(String[] args){
        ExcelSheet excelSheet = new ExcelSheet();
        String res = excelSheet.convertToTitle(2147483647);
        System.out.println(res);
    }
}
