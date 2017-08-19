package abstractClassAndInterface;

public abstract interface InterfaceTest {

	/**
	 * 接口中所有变量被static final隐式修饰，不可改变
	 */
	public static final String str="provencesl";
	public String s=null;
	//	s="a";  报错。此时的变量被final修饰，其实是个常量，不可改变
	
	/**
	 * 接口中所有方法被public abstract隐式修饰,不可改变
	 */
	public abstract void name();
	public void add(int i);
	//public void delete(){};  报错。接口中不可以有具体的实现
	//protected void a();    报错
	
	
}
