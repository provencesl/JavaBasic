package methodCall_InClass;

public class MyTest {

	private static int a;
	private int b;
	
	public MyTest(){
		System.out.println("初始化成功");
	}
	
	static{
		a=10;
		System.out.println("进入静态代码块");
		
	}
	public static void hello(){
		System.out.println("hello");
		a=10;    //静态方法可以访问静态变量  
	//	b=20;  错误，静态方法内不可以访问非静态字段
	//static int c=3;  错误 局部变量不可声明为static
	}
	
	public static void main(String[] args){
		MyTest t= new MyTest();
		t.hello();
		MyTest.hello();
	}
}
