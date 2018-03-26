package ch04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*描述：
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 
 * 解题思路：
 * 先前序遍历这棵树的节点，如果遍历到节点有子节点，
 * 就交换它的两个子节点。当交换完所有非叶子节点的左右
 * 子节点之后，就会得到树的镜像。
 * 
 * 即为交换二叉树的左右子树，可用递归实现。
 * 交换根节点的左右孩子，再分别实现对左孩子进行镜像
 * 和右孩子进行镜像
 * 
 */
public class MirrorOfBinaryTree {

	/*
	 * 二叉链表结构组成二叉树
	 * 核心思想：每个节点记住左右子节点。
	 * 为每个子节点增加left,right指针
	 */
	private class TreeNode{
		int val = 0;
		TreeNode lchild = null;
		TreeNode rchild = null;
		
		public TreeNode(){}
		
		
		public TreeNode(int val){
			this.val = val;
		}
		
		public TreeNode(int val,TreeNode lchild,TreeNode rchild){
			this.val = val;
			this.lchild = lchild;
			this.rchild = rchild;
		}
		
		public void setRchild(TreeNode rchild){
			this.rchild = rchild;
		}
		
		public void setLchild(TreeNode lchild){
			this.lchild = lchild;
		}
	}
	
	private TreeNode root;
	private List<TreeNode> nodeList = null;
	

	public TreeNode buildTree(int[] array){
		
		nodeList = new LinkedList<TreeNode>();
		//
		for(int i=0;i<array.length;i++){
			nodeList.add(new TreeNode(array[i]));
		}
		
		for(int j=0;j<(array.length/2-1);j++){
			//
			nodeList.get(j).setLchild(nodeList.get(j*2+1));
			//
			nodeList.get(j).setRchild(nodeList.get(j*2+2));
		}
		
		int index = array.length/2-1;
		
		nodeList.get(index).setLchild(nodeList.get(index*2+1));
		
		if(array.length % 2 ==1){
			nodeList.get(index).setRchild(nodeList.get(index*2+2));
		}
		
		root = nodeList.get(0);
		return root;
		
	}
	
	
	public MirrorOfBinaryTree(){
		this.root = new TreeNode();
	}
	
	
	public void mirror(TreeNode root){
		if(root == null){
			return;
		}
		if(root.lchild == null && root.rchild == null){
			return;
		}
		
		//交换节点的左右子树
		TreeNode tmp = root.lchild;
		root.lchild = root.rchild;
		root.rchild = tmp;
		
		//对左右子树分别镜像
		if(root.lchild!=null){
			mirror(root.lchild);
		}
		if(root.rchild!=null){
			mirror(root.rchild);
		}
		
	}
	
	//中序遍历打印
	public void printTree(TreeNode root){
		if(root != null){
			printTree(root.lchild);
			System.out.print(root.val + "  ");
			printTree(root.rchild);
		}
	}
	
	

	
	
	public static void main(String[] args){
	
		//int array[] = {8,6,10,5,7,9,11};
		int array[] = {8,6,10,5,7,9,11};
		MirrorOfBinaryTree bt = new MirrorOfBinaryTree();
		TreeNode root = bt.buildTree(array);
		
		bt.printTree(root);
		
		System.out.println("镜像之后：");
		
		bt.mirror(root);
		bt.printTree(root);
		
	}
	
}
