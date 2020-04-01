package chpz;

public class QuickSort {
    /**
     * 快速排序
     * @param arr 待排序数组
     * @param L 指向左边第一个元素
     * @param R 指向右边最后一个元素
     */
    public static void sort(int[] arr, int L, int R){
        int i = L;
        int j = R;
        //任选支点，选了中间的。
        int pivot = arr[(L + R)/2];
        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j){
            //寻找直到比支点大的数
            while (pivot > arr[i]){
                i++;
            }
            //寻找直到比支点小的数
            while ((pivot < arr[j])){
                j--;
            }
            if (i <= j){
                //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //直至i=j=pivot
                i++;
                j--;
            }
        }
        //此时再完成后续的趟数直至排序完成
        if (L < j){
            //“左边”再做排序，直到左边剩下一个数(递归出口)
            sort(arr, L, j);
        }
        if (i < R){
            //“右边”再做排序，直到右边剩下一个数(递归出口)
            sort(arr, i, R);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 67, 2, 7, 8, 6, 9, 44};

        sort(arr, 0, 9);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            System.out.println("");
        }


    }
}
