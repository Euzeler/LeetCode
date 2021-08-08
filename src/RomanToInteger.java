public class RomanToInteger {
    public int romanToInteger(String s){
        int sum = 0;
        int index = 0;
        //放在这里是错的，因为这样的话，c就永远是第一个字符
        //char c = s.charAt(index);
        while(index < s.length()) {
            char c = s.charAt(index);
            if (c == 'M') {
                sum += 1000;
            }
            else if(c == 'C'){
                if(index + 1 < s.length() && s.charAt(index + 1) == 'D'){
                    sum += 400;
                    index++;
                }
                else if(index + 1 < s.length() && s.charAt(index + 1) == 'M'){
                    sum += 900;
                    index++;
                }
                else{
                    sum += 100;
                }
            }
            else if(c == 'D'){
                sum += 500;
            }
            else if(c == 'X'){
                if(index + 1 < s.length() && s.charAt(index + 1) == 'L'){
                    sum += 40;
                    index++;
                }
                else if(index + 1 < s.length() && s.charAt(index + 1) == 'C'){
                    sum += 90;
                    index++;
                }
                else{
                    sum += 10;
                }
            }
            else if(c == 'L'){
                sum += 50;
            }
            else if(c == 'I'){
                if(index + 1 < s.length() && s.charAt(index + 1) == 'V'){
                    sum += 4;
                    index++;
                }
                else if(index + 1 < s.length() && s.charAt(index + 1) == 'X'){
                    sum += 9;
                    index++;
                }
                else{
                    sum += 1;
                }
            }
            else if(c == 'V'){
                sum += 5;
            }
            index++;
        }
        return sum;
    }

    public static void main(String[] args){
        RomanToInteger rTI = new RomanToInteger();
        String a = "MCMXCIV";
        int sum = rTI.romanToInteger(a);
        System.out.println(sum);
    }
}
