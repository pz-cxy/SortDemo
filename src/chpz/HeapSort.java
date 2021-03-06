package chpz;

public class HeapSort {
    /**
     * 建堆
     *
     * @param arrays          看作是完全二叉树
     * @param currentRootNode 当前父节点位置
     * @param size            节点总数
     */
    public static void heapity(int[] arrays, int currentRootNode, int size) {
        if (currentRootNode < size) {
            //左子树和右子树的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;
            //把当前父节点当成最大的
            int max = currentRootNode;
            if (left < size) {
                //如果比父节点还大，记录其位置
                if (arrays[max] < arrays[left])
                    max = left;
            }
            if (right < size) {
                if (arrays[max] < arrays[right])
                    max = right;
            }
            if (max != currentRootNode) {
                //如果最大的不是根元素位置，那么就交换
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;
                //继续比较，直到完成一次建堆
                heapity(arrays, max, arrays.length);
            }
        }

    }

    /**
     * 完成一次建堆，最大值在堆的顶部(根节点)
     */
    public static void maxHeapify(int[] arrays, int size) {

        // 从数组的尾部开始，直到第一个元素(角标为0)
        for (int i = size - 1; i >= 0; i--) {
            heapity(arrays, i, size);
        }

    }

    public static void sort(int[] arrays) {
        //每次建堆就可以排除一个元素了
        for (int i = 0; i < arrays.length; i++) {

            //每次建堆就可以排除一个元素了
            maxHeapify(arrays, arrays.length - i);

            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;

        }
    }
}
