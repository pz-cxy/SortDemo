package chpz;

public class BubbleSort {
    public static void sort(int[] arrays){
        int temp;
        for (int i=0;i<arrays.length-1;i++){
            for (int j = 0; j<arrays.length-i-1;j++){
                if (arrays[j] > arrays[j + 1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j+1] = temp;
                }
            }
        }
    }
    public static void supperSort(int[] arrays){
        int temp;
        int isChange = 0;       //记录一趟中是否有置换，0为否
        for (int i=0;i<arrays.length-1;i++){
            isChange = 0;
            for (int j = 0; j<arrays.length-i-1;j++){
                if (arrays[j] > arrays[j + 1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j+1] = temp;
                    isChange = 1;
                }
            }
            if (isChange == 0){
                break;      //没有发生置换说明已经排好顺序了，可以不用进行后面的排序了。
            }
        }
    }
    public static void bubbleRecSort(int[] arrays, int L, int R){
        int temp;
        if (L == R);
        else {
            for(int i=L; i<R; i++){
                if (arrays[i] > arrays[i + 1]) {
                    temp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = temp;
                }
            }
            bubbleRecSort(arrays, L, R - 1);
        }

    }
    public static void main(String[] args) {
        int[] arrays = {5,2,7,3,9};
        // supperSort(arrays);
        bubbleRecSort(arrays, 0, arrays.length-1);
        for (int i=0; i<arrays.length; i++){
            System.out.print(arrays[i]);
            System.out.println("");
        }
    }

}
