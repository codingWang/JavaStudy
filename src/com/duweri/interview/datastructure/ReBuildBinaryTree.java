package com.duweri.interview.datastructure;


/**
 * 已知前序遍历和后续遍历重建二叉树
 * @author 杜伟
 */
public class ReBuildBinaryTree {
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){val = x;}
	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
         
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);//前序遍历的第一个结点
         
        for(int i=startIn;i<=endIn;i++){//遍历中序数组
            if(in[i]==pre[startPre]){			//如果中序的某节点和前序一样
            	//递归左边
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                //递归右边
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        }//循环完数组结束
        
        return root;//返回根节点
    }
	

		
		
	public static void main(String[] args) {

	}

}
