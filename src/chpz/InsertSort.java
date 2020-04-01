package chpz;

public class InsertSort {
    public static void sort(int[] arrays){
        int temp;
        for (int i=1; i<arrays.length;i++){
            temp = arrays[i];
            while (i>=1 && arrays[i - 1] > temp){
                arrays[i] = arrays[i-1];
                i--;
            }
            arrays[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arrays = {3,1,6,2,5};
        sort(arrays);
        for (int i=0; i<arrays.length; i++){
            System.out.print(arrays[i]);
            System.out.println("");
        }
    }
}
