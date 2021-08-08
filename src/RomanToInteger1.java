import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RomanToInteger1 {
    public int romanToInteger(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += map.get(s.charAt(i));
            list.add(map.get(s.charAt(i)));
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                sum -= 2 * map.get(s.charAt(i - 1));
            }
        }
        return sum;
    }

    public static void main(String[] args){
        RomanToInteger1 rTI = new RomanToInteger1();
        String s = "MCMXCIV";
        int sum = rTI.romanToInteger(s);
        System.out.println(sum);
    }
}
