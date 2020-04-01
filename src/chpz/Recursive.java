package chpz;

public class Recursive {
    //用递归实现1+2+3+...+100的计算
    public static int recAdd(int n){
        if (n == 1){
            return 1;
        }else {
            return recAdd(n-1) + n;
        }
    }
    //用递归实现寻找数组最大值
    public static int recFindAddd(int[] arrays, int L, int R){
        if (L == R){
            return arrays[L];
        }else {
            int a = arrays[L];
            int b = recFindAddd(arrays, L + 1, R);
            if (a > b){
                return a;
            }else {
                return b;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recAdd(100));
        int[] arrays = {2, 3, 4, 5, 1, 5, 2, 9, 5, 6, 8, 3, 1};

        System.out.println(recFindAddd(arrays, 0, arrays.length - 1));

    }
}
