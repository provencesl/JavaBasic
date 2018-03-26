package ch03;

import java.util.Stack;


/*
 * 设计包含min函数的栈
 * 要求函数min(),push(),pop()的时间复杂度都为O（1）
 * 思路：设计栈的元素同时包含当前值和当前最小值，
 * 这样当pop调最小值的时候，栈顶元素依然包含当前最小值
 * 即思考使用两个栈一个存放数据，一个存放最小值
 */
public class Solution {


	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public void push(int node){
		stack1.push(node);
		if(stack2.isEmpty()){
			stack2.push(node);
			
		}else if(node < min()){
			stack2.push(node);
		}else{
			stack2.push(min());
		}
	}
	
	
	public void pop(){
		stack1.pop();
		stack2.pop();
	}
	
	//查看栈顶元素
	public int top(){
		return stack1.peek();
	}
	
	public int min(){
		return stack2.peek();
	}
	
	
	public static void main(String[] args){
		Solution solution = new Solution();
		for(int i = 0;i < 3; i++){
			solution.push(i);
		}
		for(int j = 0;j < 3;j++){
			System.out.println("查看数据栈的栈顶元素：");
			System.out.println(solution.top());
			System.out.println("查看存储最小值的栈中元素：");
			System.out.println(solution.min());
		}
		
	}
	
	
}
