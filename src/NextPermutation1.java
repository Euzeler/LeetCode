public class NextPermutation1 {
    public void nextPermutation(int[] A) {
        if(A.length == 1 || A.length == 0) return;
        //找到第一个破坏递减的j
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--;
        if(i >= 0){
            int j = A.length - 1;
            while(j >= 0 && A[j] <= A[i]) j--;
            swap(A, i, j);
        }
        reverse(A, i + 1, A.length - 1);
    }

    public void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j){
        while(i < j){
            swap(A, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        NextPermutation1 n = new NextPermutation1();
        int[] a = {1,3,2};
        n.nextPermutation(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //测试用例，{1,2,3,4},{1,3,2},{4,3,2,1}
    }
}
