package methodCall_InClass;

class Demo{
	
	public static void hello(){
		System.out.println("hello");
	}
}

public class Test {

	public static void main(String[] args){
		Demo demo=null;
		Demo demo1 = new Demo();
		demo.hello();
		demo1.hello();
	}
}
