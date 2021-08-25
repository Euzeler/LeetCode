public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves){
        //直接改进
        int[] tmp = new int[2];
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                tmp[0]++;
            }
            else if(moves.charAt(i) == 'D'){
                tmp[0]--;
            }
            else if(moves.charAt(i) == 'L'){
                tmp[1]++;
            }
            else if(moves.charAt(i) == 'R'){
                tmp[1]--;
            }
        }
        if(tmp[0] == 0 && tmp[1] == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args){
        RobotReturnToOrigin ro = new RobotReturnToOrigin();
        String moves = "UD";
        boolean ret = ro.judgeCircle(moves);
        System.out.println(ret);
    }
}
