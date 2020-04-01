package chpz;

//二叉树
public class TreeNode {
    //左节点
    private TreeNode leftTreeNode;
    // 右节点(儿子)
    private TreeNode rightNode;
    // 数据
    private int value;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    //先序遍历
    public static void preTraverseTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问左节点
            preTraverseTree(rootTreeNode.getLeftTreeNode());
            //访问右节点
            preTraverseTree(rootTreeNode.getRightNode());
        }
    }
    //后序遍历
    public static void inTraverseBTree(TreeNode rootTreeNode){
        if (rootTreeNode != null){
            //访问左节点
            preTraverseTree(rootTreeNode.getLeftTreeNode());
            //访问根节点
            System.out.println(rootTreeNode.getValue());
            //访问右节点
            preTraverseTree(rootTreeNode.getRightNode());
        }
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(35);
        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightNode(treeNode3);
        treeNode3.setLeftTreeNode(treeNode4);
        treeNode3.setRightNode(treeNode5);
    }

}
