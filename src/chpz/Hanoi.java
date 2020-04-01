package chpz;

public class Hanoi {
    /**
     * 汉诺塔
     * @param n n个盘子
     * @param start 起始柱子
     * @param transfer 中转柱子
     * @param target 目标柱子
     */
    public static void completeHanoi(int n, int start, int transfer, int target){
        if (n == 1){
            System.out.println(start + "---->" + target);
        }else {
            //起始柱子借助目标柱子将盘子都移动到中转柱子中(除了最大的盘子)
            completeHanoi(n - 1, start, target, transfer);
            System.out.println(start + "---->" + target);
            //中转柱子借助起始柱子将盘子都移动到目标柱子中
            completeHanoi(n - 1, transfer, start, target);
        }
    }

    public static void main(String[] args) {
        completeHanoi(3, 'A', 'B', 'C');
        System.out.println("" );
    }
}
