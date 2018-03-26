package ch03;

import java.util.List;

/*
 * 
 * 问题描述:
 * 
 * 输入两个单词递增的链表，输出两个链表合成后的链表
 * 且合成后的链表满足单调不递增的规则
 * 
 * 
 * 解题思路：
 * 1.
 * 比较两个了链表的头节点的值，将其中较小的头节点连接到
 * 已经合并的链表中，两个链表剩余的节点依然是排序的。因此
 * 合并的步骤和之前的步骤一样。典型递归。
 * 定义递归函数完成这一过程
 * 
 * 2.注意鲁棒性
 * 每当代码视图访问控制帧指向的内存是，程序就会崩溃，从而导致鲁棒性问题。
 *本题中，一旦输入空的链表就会引入空的指针，因此我们要对空链表进行单独处理。
 * 
 * 
 * 
 * 
 */

class ListNode{
	int val;
	ListNode next = null;
	ListNode(int val){
		this.val = val;
	}
	public ListNode next() {
		// TODO Auto-generated method stub
		return null;
	}
}




public class Solution2 {

	public ListNode Merge(ListNode list1,ListNode list2){
		if(list1 == null){
			return list2;
		}
		else if(list2 == null){
			return list1;
		}
		
		ListNode pMergedHead = null;
		
		if(list1.val <= list2.val){
			pMergedHead = list1;
			pMergedHead.next = Merge(list1.next, list2);
		}
		return pMergedHead;
		
	}
	
	
}
