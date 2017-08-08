package stack;

public class LinkListStack {

private LinkList ll = new LinkList();
	
	public void push(Object obj){
		ll.insertFirst(obj);
	}
	
	public Object pop() throws Exception{
		return ll.deleteFirst();
	}
	
	public void display(){
		ll.display();
	}
	
	public static void main(String[] args) throws Exception{
		LinkListStack lls = new LinkListStack();
		lls.push(1);
		lls.push(2);
		lls.push(3);
		lls.display();
		System.out.println(lls.pop());
		lls.display();
	}
}
