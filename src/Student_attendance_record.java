public class Student_attendance_record {
    public boolean checkRecord(String s){
        //自己约定一个数组，
        int countA = 0;
        if(s.length() == 1) return true;
        if(s.length() == 2){
            if(s.charAt(0) == 'A') countA++;
            if(s.charAt(1) == 'A') countA++;
        }
        if(s.length() > 2) {
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == 'A') {
                    countA++;
                }
                if (i == s.length() - 3) {
                    if (s.charAt(s.length() - 2) == 'A') {
                        countA++;
                    }
                    if (s.charAt(s.length() - 1) == 'A') {
                        countA++;
                    }
                }
                if (countA == 2) {
                    return false;
                }
                if (s.charAt(i) == 'L') {
                    if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                        return false;
                    }
                }
            }
        }
        if(countA < 2){
            return true;
        }
        else return false;
    }

    public static void main(String[] args){
        String str = "AA";
        Student_attendance_record s = new Student_attendance_record();
        boolean ret = s.checkRecord(str);
        System.out.println(ret);
    }
}
