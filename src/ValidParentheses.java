import java.util.HashMap;
import java.util.Stack;

//hashMap，栈，
public class ValidParentheses {
    public boolean isValid(String s){
        Boolean result = false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> stk = new Stack<Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }
            else if(c == ')' || c == '}' || c == ']') {
                if (stk.isEmpty()) {
                    result = false;
                    break;
                }
                char popchar = stk.pop();
                if(popchar != map.get(c)){
                    result = false;
                    break;
                }
//                if(popchar == map.get(c)){
//                    //这样写就pop两次了，就会导致栈空
//                    stk.pop();
//                }
            }
            result = true;
        }
        if(!stk.isEmpty()){
            result = false;
        }
        return result;
    }

    public static void main(String[] args){
        ValidParentheses v = new ValidParentheses();
        Boolean result = v.isValid("(()[]{})");
        System.out.println(result);
    }
}
