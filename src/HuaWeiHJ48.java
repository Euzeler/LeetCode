//import java.util.ArrayList;
//import java.util.List;
//
//public class HuaWeiHJ48 {
//    public static void main(String[] args){
//        List<Integer> test = new ArrayList<>();
//        test.add(1);
//        test.add(0,2);
//        System.out.println(test.indexOf(2));
//        System.out.println(test);
//    }
//}

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class HuaWeiHJ48{
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int head = scanner.nextInt();
//        List<Integer> list = new ArrayList<>();
//        list.add(head);
//        int i = 1;
//        while(i < N){
//            int value = scanner.nextInt();
//            int preValue = scanner.nextInt();
//            int index = list.indexOf(preValue);
//            list.add(index + 1, value);
//            i++;
//        }
//        int removeValue = scanner.nextInt();
//        list.remove(list.indexOf(removeValue));
//        System.out.println(list);
//        for(int j = 0; j < list.size(); j++){
//            System.out.print(list.get(j) + " ");
//        }

        List<String> pri = new ArrayList<>();
        pri.add("3");
        pri.add("4");
        pri.add("5");
        pri.add("6");
        pri.add("7");
        pri.add("8");
        pri.add("9");
        pri.add("10");
        pri.add("J");
        pri.add("Q");
        pri.add("K");
        pri.add("A");
        pri.add("2");
        pri.add("joker");
        pri.add("JOKER");
        System.out.println(pri);
        System.out.println(pri.indexOf("8"));
    }
}
