package copyArray;


//被克隆的类要实现Cloneable接口
class Cat implements Cloneable 
{
	
	/**
	 * java.lang.Object类的clone()方法为protected类型，不可直接调用:
	 * 
		首先被克隆的类实现Cloneable接口；然后在该类中覆盖clone()方法，
		并且在该clone()方法中调用super.clone()；这样，
		super.clone()便可以调用java.lang.Object类的clone()方法。
	 */
	
	private String name;
	private int age;
	public Cat(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	//重写clone()方法
	protected Object clone()throws CloneNotSupportedException{  
      return super.clone() ;  
  }
}



public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {

		Cat cat1=new Cat("xiaohua",3);
		System.out.println(cat1);
		//调用clone方法
		Cat cat2=(Cat)cat1.clone();
		System.out.println(cat2);
	}
}