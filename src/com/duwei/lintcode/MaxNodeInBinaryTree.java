package com.duwei.lintcode;


import java.util.List;

/**
 * 返回二叉树的最大节点
 */
public class MaxNodeInBinaryTree {

    TreeNode treeNode = new TreeNode(-100000);//初始值设置极小

    public TreeNode maxNode(TreeNode root) {

        if (root == null) {
            return null;
        }
        if (root.value > treeNode.value) {
            treeNode = root;
        }

        if (root.left != null) {
            maxNode(root.left);
        }

        if (root.right != null) {
            maxNode(root.right);
        }

        return treeNode;
    }

    private static class TreeNode {
        public int value;
        public TreeNode left, right;

        public TreeNode(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }


}
