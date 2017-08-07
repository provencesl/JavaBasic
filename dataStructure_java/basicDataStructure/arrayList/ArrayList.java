package arrayList;

public class ArrayList implements ListImpl {

	/**
	 * 顺序表默认的初始大小
	 */
	public static final int defineLen = 20;
	private int maxLen;
	private Object[] array;
	private int size;
	
	//构造函数
	public ArrayList() {
		size = 0;
		maxLen = defineLen;
		array = new Object[defineLen];
	}
	
	//移出所有元素
	public void clear() {
		size = 0;
	}

	//返回指定位置的元素
	public Object get(int i) {
		if(i>=0 && i<size)
			return array[i];
		else
			return null;
	}

	//返回第一次出现指定元素的索引
	public int indexOf(Object e) {
		int i =0; 
		while(i<size && !array[i].equals(e)) {
			i++;
		}
		if(i < size)
			return i;
		else
			return -1;
	}

	//在第i个位置插入元素
	public void insert(int i, Object e) {
		if(i >= size) {
			i = size;
			if((size) >= maxLen)//如果插入数的位置大于顺序表的最大容量，则扩大容量
				expand();
		}
		else{
				//插入元素位于线性表中，第i+1到第size个元素后移一位
				for(int j = size; j>i+1; j--) {
					array[j] = array[j-1]; //后移一位
				}
				array[i+1] = e;
				size ++;
			}
	}

	//清空
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else 
			return false;
	}

	
	public int lastIndexOf(Object e) {
		int i = size-1;
		while(i>=0 && !array[i].equals(e)) {
			i--;
		}
		if(i>=0)
			return i;
		else
			return -1;
	}

	//删除指定位置上的元素
	public void remove(int i) {
		for(int j=i; j<size-1; j++) {
			array[j] = array[j+1];
		}
		size --;
	}

	//用指定元素替代指定位置上的元素
	public void set(int i, Object e) {
		array[i] = e;
	}

	//返回长度
	public int size() {
		return size;
	}
	/**
	 * 当顺序表的大小不够时，扩充顺序表的大小
	 */
	private void expand() {
		maxLen = 2*maxLen;
		Object newArray[] = new Object[maxLen];
		for(int i=0; i<size; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	//将指定元素添加至表尾部
	public void add(Object e) {
		if(size >=maxLen)
			expand();
		array[size] = e;
		size ++;
	}
}
