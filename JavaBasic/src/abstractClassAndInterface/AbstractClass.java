package abstractClassAndInterface;


abstract class Bases{
	   abstract public void hello();
	}

	class Ai extends Bases{
	    public void hello(){
	        System.out.println("hello A");
	    }
	}

	class Bi extends Bases{
	    public void hello(){
	        System.out.println("hello B");
	    }
	}

public class AbstractClass{
	    public static void main(String[] args){
	        Bases a = new Ai();
	        Bases b = new Bi();

	        a.hello();
	        b.hello();
	    }
	}
