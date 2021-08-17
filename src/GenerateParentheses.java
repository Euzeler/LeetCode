import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n){
        //compiler题目啊,用栈来做,(入栈，)出栈，连出两个，这个是判断
        //递归做，这个是生成
        List<String> ret = new LinkedList<>();
        generate(ret, "", 0, 0, n);
        return ret;
    }

    //注意这里又是void，
    public void generate(List<String> list, String s, int open, int close, int max){
        //递归结束
        if(s.length() == max * 2){
            list.add(s);
            return;
        }

        if(open < max){
            generate(list, s + "(", open + 1, close, max);
        }
        if(close < open){
            generate(list, s + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args){
        GenerateParentheses g = new GenerateParentheses();
        List<String> ret = g.generateParenthesis(4);
        System.out.println(ret);
    }
}
