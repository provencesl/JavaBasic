package abstractClassAndInterface;

 

	class Base{
	    public void hello(){
	        System.out.println("hello Base");
	    }
	}

	class A extends Base{
	   /* public void hello(){
	        System.out.println("hello A");
	    }		*/							//hello A
	}

	class B extends Base{
	   /* public void hello(){
	        System.out.println("hello B");
	    }	*/								//hello B
	}


public class AbstractClassTest {
	    public static void main(String[] args){
	        Base a = new A();
	        Base b = new B();

	        /**
	         * 父类中的同名方法被子类覆盖时，
	         * 调用的默认为子类方法
	         * 否则，调用父类方法
	         */
	        a.hello();			//hello Base
	        b.hello();
	    }
	}

