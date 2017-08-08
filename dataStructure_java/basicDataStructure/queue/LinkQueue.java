package queue;

/**
 * 链队列的结点
 * @author luoweifu
 *
 */

class Node{
	Object data;	//数据元素
	Node next;		//后驱结点
	public Node() {
		this(null);
	}
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
}

/**
 * 链队列
 * @author Administrator
 *
 */
public class LinkQueue implements Queue{
	private Node front,rear;	//队头指针和队尾指针
	private int size;
	public LinkQueue() {
		front = rear = new Node();
		size = 0;
	}
	@Override
	public void clear() {
		front.next = null;
		rear = front;
		size = 0;
	}

	@Override
	public Object deQueue() {
		Node p = front.next;
		front.next = p.next;
		rear = p.next;
		size --;
		return p.data;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else 
			return false;
	}

	@Override
	public Object peek() {
		return front.next.data;
	}

	@Override
	public void push(Object obj) {
		Node p = new Node(obj);
		rear.next = p;
		rear = p;
		size ++;
	}

	@Override
	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder("[");
		Node p = front;
		while((p=p.next) != null) {
			sb.append(p.data + ", ");
		}
		sb.append("]");
		return sb.toString();	
	}
}
