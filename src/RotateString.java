public class RotateString {
    public boolean rotateString(String s, String goal){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            str.append(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            if(str.toString().equals(goal)){
                return true;
            }
            str.append(s.charAt(i));
            str.delete(0, 1);
        }
        return false;
    }

    public static void main(String[] args){
        RotateString ro = new RotateString();
        String s = "abcde";
        String goal = "cdeab";
        boolean ret = ro.rotateString(s, goal);
        System.out.println(ret);
    }
}
