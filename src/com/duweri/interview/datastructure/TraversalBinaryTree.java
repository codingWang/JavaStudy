package com.duweri.interview.datastructure;

import java.util.*;

/**
 * 二叉树的遍历
 */
public class TraversalBinaryTree {

    private void printNode(Node node) {
        System.out.print(node.getData());
    }

    /**
     * 先序遍历---递归
     */
    public void theFirstTraversal(Node root) {
        printNode(root); // 根
        if (root.getLeftNode() != null) { // 左
            theFirstTraversal(root.getLeftNode());
        }
        if (root.getRightNode() != null) { // 右
            theFirstTraversal(root.getRightNode());
        }
    }

    /**
     * 中序遍历---递归
     */
    public void theInOrderTraversal(Node root) {
        if (root.getLeftNode() != null) { // 左
            theInOrderTraversal(root.getLeftNode());
        }
        printNode(root); // 中
        if (root.getRightNode() != null) {
            theInOrderTraversal(root.getRightNode());// 右
        }
    }

    /**
     * 后序遍历---递归
     */
    public void thePostOrderTraversal(Node root) {
        if (root.getLeftNode() != null) {
            thePostOrderTraversal(root.getLeftNode());
        }
        if (root.getRightNode() != null) {
            thePostOrderTraversal(root.getRightNode());
        }
        printNode(root);
    }

    /**
     * 前序遍历---非递归算法
     */
    public void theFirstTraversal_Stack(Node root) {
        Stack<Node> stack = new Stack<Node>();//初始化栈
        Node node = root;                    //遍历过程中移动此节点
        while (node != null || stack.size() > 0) { // 将所有左孩子压栈
            if (node != null) { //节点不为空，
                printNode(node);// 输出该节点
                stack.push(node);//节点入栈
                node = node.getLeftNode();//指向左孩子
            } else {        //节点为空
                node = stack.pop();//出栈返回，去遍历右孩子
                node = node.getRightNode();
            }
        }
    }

    /**
     * 中序遍历---非递归算法
     */
    public void theInOrderTraversal_Stack(Node root) {
        Stack<Node> stack = new Stack<Node>();//初始化栈
        Node node = root;                        //临时指针节点
        while (node != null || stack.size() > 0) {//栈不空或者节点不空
            if (node != null) {                    //节点不空的情况
                stack.push(node);
                node = node.getLeftNode();
            } else {                        //栈不空的情况
                node = stack.pop();
                printNode(node);
                node = node.getRightNode();
            }
        }
    }

    /**
     * 后序遍历---非递归算法
     */
    public void thePostOrderTraversal_Stack(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Stack<Node> output = new Stack<Node>();// 构造一个中间栈来存储逆后序遍历的结果
        Node node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                output.push(node);
                stack.push(node);
                node = node.getRightNode();
            } else {
                node = stack.pop();
                node = node.getLeftNode();

            }
        }
        while (output.size() > 0) {
            printNode(output.pop());
        }
    }

    /**
     * 深度优先遍历二叉树
     *
     * @param root 根节点
     */
    public void depthFirstSearch(Node root) {
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        Node node = root;
        while (!stack.empty()) {
            node = stack.pop();
            printNode(node);  //遍历根结点
            if (node.getRightNode() != null) {
                stack.push(node.getRightNode());  //先将右子树压栈
            }
            if (node.getLeftNode() != null) {
                stack.push(node.getLeftNode());  //再将左子树压栈
            }
        }
    }

    /**
     * 广度优先遍历二叉树
     *
     * @param node 根节点
     */
    public void breadthFirst(Node node) {
        Deque<Node> nodeDeque = new ArrayDeque();
        nodeDeque.add(node);
        while (!nodeDeque.isEmpty()) {
            node = nodeDeque.removeFirst();//取出并移除!!
            printNode(node);
            if (node.getLeftNode() != null) {
                nodeDeque.add(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                nodeDeque.add(node.getRightNode());
            }
        }
    }

    public void breadthFirst2(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            node = queue.poll();
            printNode(node);
            if (node.getLeftNode() != null){
                queue.offer(node.getLeftNode());
            }
            if (node.getRightNode() != null){
                queue.offer(node.getRightNode());
            }
        }
    }


    public static void main(String[] args) {
        TraversalBinaryTree tree = new TraversalBinaryTree();
        Node root = tree.init();
        System.out.println("先序遍历");
        tree.theFirstTraversal(root);
        System.out.println("");
        System.out.println("中序遍历");
        tree.theInOrderTraversal(root);
        System.out.println("");
        System.out.println("后序遍历");
        tree.thePostOrderTraversal(root);
        System.out.println("");
        System.out.println("广度优先");
        tree.breadthFirst(root);
        System.out.println("");
        System.out.println("广度优先2");
        tree.breadthFirst2(root);
    }

    public Node init() {// 注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，
        // 而初始化是按顺序初始化的，不逆序建立会报错
        Node J = new Node("I",8, null, null);
        Node H = new Node("H",4, null, null);
        Node G = new Node("G",2, null, null);
        Node F = new Node("F",7, null, J);
        Node E = new Node("E",5, H, null);
        Node D = new Node("D",1, null, G);
        Node C = new Node("C",9, F, null);
        Node B = new Node("B",3, D, E);
        Node A = new Node("A",6, B, C);
        return A; // 返回根节点
    }

    /**
     * A(6)
     * B(3)					C(9)
     * D(1)			E(5)		F(7)		null
     * null	 G(2)	H(4)   null	 null   J(8)
     * null   null
     */

    public class Node {
        private int data;
        private String name;
        private Node leftNode;
        private Node rightNode;

        public Node(String name, int data, Node leftNode, Node rightNode) {
            this.name = name;
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(Node leftNode) {
            this.leftNode = leftNode;
        }

        public Node getRightNode() {
            return rightNode;
        }

        public void setRightNode(Node rightNode) {
            this.rightNode = rightNode;
        }
    }

}
