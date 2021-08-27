import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> ret = new ArrayList<>();
        for(int i = left; i < right + 1; i++){
            if(isSelfDividing(i)){
                ret.add(i);
            }
        }
        return ret;
    }

    public boolean isSelfDividing(int num){
        int num1 = num;
        while(num > 0){
            int tmp = num % 10;
            if(tmp == 0){
                return false;
            }
            if(num1 % tmp != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args){
        SelfDividingNumbers self = new SelfDividingNumbers();
        int left = 1, right = 202;
        List<Integer> ret = self.selfDividingNumbers(left, right);
        System.out.println(ret);
        System.out.println("测试： " + self.isSelfDividing(right));
    }
}
