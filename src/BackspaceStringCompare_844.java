import java.util.Stack;

public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t){
        //用堆栈吧
        Stack s1 = new Stack();
        Stack t1 = new Stack();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '#'){
                s1.push(s.charAt(i));
            }
            else {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) != '#'){
                t1.push(t.charAt(i));
            }
            else {
                if(!t1.isEmpty()) {
                    t1.pop();
                }
            }
        }
        System.out.println("测试0： " + s1.size());
        StringBuilder str1 = new StringBuilder();
        for(int i = 0; i < s1.size(); i++){
            str1.append(s1.get(i));
        }
        System.out.println("测试1： " + str1);
        String strFi = str1.toString();

        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i < t1.size(); i++){
            str2.append(t1.get(i));
        }
        System.out.println("测试2： " + str2);

        //就是说这里比较是否相等的时候，用堆栈比不行，用StringBuilder比不行，用==也不行，要这样写，学到了
        if(strFi.equals(str2.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        BackspaceStringCompare_844 ba = new BackspaceStringCompare_844();
        String s = "ab#c";
        String t = "ad#c";
        boolean ret = ba.backspaceCompare(s, t);
        System.out.println(ret);
    }
}
