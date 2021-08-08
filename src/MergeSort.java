public class MergeSort {
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[m + 1 + i];
        }
        //int[] res = new int[n1 + n2];这样又错了，因为没有返回值啊
        //所以既然上面已经把数组复制进两个左右两个数组了，那就直接改原来的数组就好了，
        int k = l;
        //int k = 0就错了
        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                k++;
            } else if (L[i] > R[j]) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l < r) {
            //int m = l + (r - l) / 2;//这样也可以
            int m = (l + r) / 2;//int m = (l + r) / 2 + 1,这样就又是错的
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args){
        MergeSort m = new MergeSort();
        int[] arr = {1,0,0,10,-1,0,99,5,-7};
        m.sort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
