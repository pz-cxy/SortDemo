package chpz;

public class SelectSort {
    public void sort(int[] arrays){
        //选择排序每趟选取最大（小）的数与数组最末的数（除已完成调换的数）调换，最终使之排序
        int temp;
        int pos;
        //外层循环控制需要排序的趟数
        for (int i = 0; i < arrays.length - 1; i++){
            pos = 0;
            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < arrays.length - i; j++){
                if (arrays[j] > arrays[pos]){
                    pos = j;
                }
            }
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length - 1 - i];
            arrays[arrays.length - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        //找出数组的最大值
        int[] arrays = {2, 3, 1, 4, 3, 5, 1, 6, 1, 2, 3, 7, 2, 3};
        int max = 0;
        for (int i=0; i < arrays.length; i++){
            if (arrays[i] > max){
                max = arrays[i];
            }
        }
        System.out.println(max);
    }
}
