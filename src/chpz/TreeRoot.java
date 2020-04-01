package chpz;

/**
 * 动态创建二叉树
 */
public class TreeRoot {
    private TreeNode treeRoot;

    public TreeNode getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeNode treeRoot) {
        this.treeRoot = treeRoot;
    }

    /**
     * 获取树的最大值
     * @param treeNode 树节点
     * @return 最大值
     */
    public static int getMax(TreeNode treeNode){
        if (treeNode == null)
            return -1;
        else {
            int leftMax = getMax(treeNode.getLeftTreeNode());
            int rightMax = getMax(treeNode.getRightNode());
            int currentRootVal = treeNode.getValue();//根节点的值
            int max = leftMax;
            if (rightMax > max)
                max = rightMax;
            if (currentRootVal > max)
                max = currentRootVal;
            return max;
        }
    }
    /**
     * 获取树的深度
     * @param treeNode  树节点
     * @return 深度
     */
    public static int getHeight(TreeNode treeNode){
        if (treeNode == null)
            return 0;
        else {
            int left = getHeight(treeNode.getLeftTreeNode());
            int right = getHeight(treeNode.getRightNode());
            int max = left;
            if (right > max)
                max = right;
            return max+1;
        }
    }
    /**
     * 动态创建二叉树
     * @param root 根节点
     * @param value 节点的值
     */
    public static void createTree(TreeRoot root, int value){
        //如果树根为空(第一次访问)，将第一个值作为根节点
        if (root.getTreeRoot() == null){
            TreeNode treeNode = new TreeNode(value);
            root.setTreeRoot(treeNode);
        }else {
            //当前树根
            TreeNode tempRoot = root.getTreeRoot();
            while (tempRoot != null){
                //当前值大于根值，往右走
                if (value > tempRoot.getValue()){
                    //右边没有树根，直接插入
                    if (tempRoot.getRightNode() == null){
                        tempRoot.setRightNode(new TreeNode(value));
                        return;
                    }else {
                        //右边有树根，到右边的树根去
                        tempRoot = tempRoot.getRightNode();
                    }
                }else {
                    //左边没树根，往左走
                    if (tempRoot.getLeftTreeNode() == null){
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    }else {
                        // 左边有树根
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }
        }
    }
}
