import java.util.HashSet;
import java.util.Scanner;

public class HuaWeiHJ9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        int ret = 0;
        HashSet hash = new HashSet();
        while(num > 0){
            int tmp = num % 10;
            if(hash.contains(tmp)){
                num /= 10;
                continue;
            }
            else{
                ret = ret * 10 + tmp;
                hash.add(tmp);
                num /= 10;
            }
        }
        System.out.println(ret);
    }
}
