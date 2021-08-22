import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s){
        //有点儿像os里面的资源分配
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){
                count++;
                i++;
                j++;
            }
            else j++;
        }
        return count;
    }

    public static void main(String[] args){
        AssignCookies a = new AssignCookies();
        int[] g = {1,2};
        int[] s = {1,2,3};
        int ret = a.findContentChildren(g, s);
        System.out.println(ret);
    }
}
