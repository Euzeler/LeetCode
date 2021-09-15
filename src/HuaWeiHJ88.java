import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class HuaWeiHJ88{
    public static void main(String[] args){
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

        Scanner scanner = new Scanner(System.in);
        String all = scanner.nextLine();
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for(int i = 0; i < all.length(); i++){
//            if(all.charAt(i) == ' '){
//                continue;
//            }
            if(all.charAt(i) == '-'){
                break;
            }
            else {
                one.append(all.charAt(i));
            }
        }
        for(int i = 0; i < all.length(); i++){
            if(all.charAt(i) == '-'){
                for(int j = i + 1; j < all.length(); j++){
//                    if(all.charAt(j) == ' '){
//                        continue;
//                    }
//                    else {
                        two.append(all.charAt(j));
//                    }
                }
            }
        }
        String oneStr = one.toString();
        String twoStr = two.toString();
        System.out.println("第一幅牌：" + oneStr);
        System.out.println("第二幅牌：" + twoStr);
        int onePri = priority(oneStr);
        int twoPri = priority(twoStr);
        if(onePri == 10){
            System.out.println("joker JOKER");
        }
        else if(twoPri == 10){
            System.out.println("joker JOKER");
        }
        else if(onePri == 4){
            if(twoPri == 4){
                if(pri.indexOf(String.valueOf(oneStr.charAt(0))) < pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                    System.out.println(twoStr);
                }
                else if(pri.indexOf(String.valueOf(oneStr.charAt(0))) > pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                    System.out.println(oneStr);
                }
            }
            else{
                System.out.println(oneStr);
            }
        }
        else if(onePri == 0){
            if(twoPri == 4){
                System.out.println(twoStr);
            }
            else if(oneStr.length() == 1){
                if(twoStr == "joker" || twoStr == "joker"){
                    System.out.println(twoStr);
                }
                else if(twoStr.length() == 1){
                    if(pri.indexOf(oneStr) < pri.indexOf(twoStr)){
                        System.out.println(twoStr);
                    }
                    else if(pri.indexOf(oneStr) > pri.indexOf(twoStr)){
                        System.out.println(oneStr);
                    }
                }
                else{
                    System.out.println("ERROR");
                }
            }
            else if(oneStr.length() == 2){
                if(twoStr.length() == 2){
                    if(pri.indexOf(String.valueOf(oneStr.charAt(0))) < pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(twoStr);
                    }
                    else if(pri.indexOf(String.valueOf(oneStr.charAt(0))) > pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(oneStr);
                    }
                }
                else {
                    System.out.println("ERROR");
                }
            }

            else if(oneStr.length() == 3){
                if(twoStr.length() == 3){
                    if(pri.indexOf(String.valueOf(oneStr.charAt(0))) < pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(twoStr);
                    }
                    else if(pri.indexOf(String.valueOf(oneStr.charAt(0))) > pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(oneStr);
                    }
                }
                else {
                    System.out.println("ERROR");
                }
            }

            else if(oneStr.length() == 5){
                if(oneStr == "joker"){
                    if(twoStr == "JOKER"){
                        System.out.println(twoStr);
                    }
                    else if(twoStr.length() == 1){
                        System.out.println(oneStr);
                    }
                }
                else if(oneStr == "JOKER"){
                    if(twoStr == "joker"){
                        System.out.println(oneStr);
                    }
                    else if(twoStr.length() == 1){
                        System.out.println(oneStr);
                    }
                }
                else if(twoStr.length() == 5){
                    if(pri.indexOf(String.valueOf(oneStr.charAt(0))) < pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(twoStr);
                    }
                    else if(pri.indexOf(String.valueOf(oneStr.charAt(0))) > pri.indexOf(String.valueOf(twoStr.charAt(0)))){
                        System.out.println(oneStr);
                    }
                }
                else {
                    System.out.println("ERROR");
                }
            }

        }
    }

    public static int priority(String str){
        if(str.length() == 11){
            return 10;
        }
        if(str.length() == 7){
            return 4;
        }
        else {
            return 0;
        }
    }
}