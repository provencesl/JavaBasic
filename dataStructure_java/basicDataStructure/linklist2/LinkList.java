package linklist2;

import java.util.*;

public class LinkList {
	
	/**
	 * 成员内部类：
	 * 1.共享外部类的属性
	 * 2.成员内部类中无static属性和方法
	 * @author sunlei
	 *
	 */
	private class Link{
		private Object obj;
		private Link next = null;
		
	//	static Object a;   wrong
		
		Link(Object obj){
			this.obj = obj;
			System.out.println("内部类初始化"); //
		}
	//	System.out.println("内部类"); 不能写在类体内，可以写在函数内
	
	}
	
	private Link first = null;
	
	 public void moredisplay(){
         System.out.println("外部类初始化");
     }
	
	// LinkList.moredisplay();
	
	public void insertFirst(Object obj){
		Link data = new Link(obj);
		data.next = first;
		first = data;
	}
	
	public Object deleteFirst() throws Exception{
		if(first == null)
			throw new Exception("empty!");
		Link temp = first;
		first = first.next;
		return temp.obj;
	}
	
	public Object find(Object obj) throws Exception{
		if(first == null)
			throw new Exception("LinkedList is empty!");
		Link cur = first;
		while(cur != null){
			if(cur.obj.equals(obj)){
				return cur.obj;
			}
			cur = cur.next;
		}
		return null;
	}
	
	public void remove(Object obj) throws Exception{
		if(first == null)
			throw new Exception("LinkedList is empty!");
		if(first.obj.equals(obj)){
			first = first.next;
		}else{
			Link pre = first;
			Link cur = first.next;
			while(cur != null){
				if(cur.obj.equals(obj)){
					pre.next = cur.next;
				}
				pre = cur;
				cur = cur.next;
			}
		}
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void display(){
		if(first == null)
			System.out.println("empty");
		Link cur = first;
		while(cur != null){
			System.out.print(cur.obj.toString() + " -> ");
			cur = cur.next;
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) throws Exception {
		LinkList ll = new LinkList();
		ll.insertFirst(4);
		ll.insertFirst(3);
		ll.insertFirst(2);
		ll.insertFirst(1);
		ll.display();
		ll.deleteFirst();
		ll.display();
		ll.remove(3);
		ll.display();
		System.out.println(ll.find(1));
		System.out.println(ll.find(4));
	}
}
