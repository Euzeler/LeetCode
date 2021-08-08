public class HeapSort {
    public static void heapSort(int[] arr){
        for(int i = arr.length / 2 + 1; i >= 0; i--){
            adjustHeap(arr, i, arr.length);
        }
        for(int i = arr.length - 1; i >= 0; i--){
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }
    }

    public static void adjustHeap(int[] arr, int i, int length){
        int temp = arr[i];
        for(int k = 2 * i + 1; k < length; k = 2 * k + 1){
            if(k + 1 < length && arr[k] < arr[k + 1]){
                k++;
            }
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }
            else {
                break;
            }
        }
        arr[i] = temp;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,3,99,6,-9,4,5,0,0,0};
        HeapSort h = new HeapSort();
        h.heapSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}



//https://blog.csdn.net/qq_36186690/article/details/82505569?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162386099116780274187843%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=162386099116780274187843&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-82505569.pc_search_result_before_js&utm_term=java%E5%AE%9E%E7%8E%B0%E5%A0%86%E6%8E%92%E5%BA%8F&spm=1018.2226.3001.4187
