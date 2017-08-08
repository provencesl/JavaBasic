package stack;

public class LinkList {
	
	private class Data{
		private Object obj;
		private Data next = null;
		
		Data(Object obj){
			this.obj = obj;
		}
	}
	
	private Data first = null;
	
	public void insertFirst(Object obj){
		Data data = new Data(obj);
		data.next = first;
		first = data;
	}
	
	public Object deleteFirst() throws Exception{
		if(first == null)
			throw new Exception("empty!");
		Data temp = first;
		first = first.next;
		return temp.obj;
	}
			
	public void display(){
		if(first == null)
			System.out.println("empty");
		System.out.print("top -> bottom : | ");
		Data cur = first;
		while(cur != null){
			System.out.print(cur.obj.toString() + " | ");
			cur = cur.next;
		}
		System.out.print("\n");
	}

}
