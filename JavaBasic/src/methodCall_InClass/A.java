package methodCall_InClass;

 public class A {

	private String name;
	private int age;

	public A(String name,int age) {
		
		this();   //可以通过this直接调用本类中的构造方法
		this.name =name;
		this.age = age;
		System.out.println("进入有参数构造方法");
	
		System.out.println(this.getAge());  //断点检测能正常获取值
		System.out.println(this.getName());
	}

	public A() {
	System.out.println("无参数构造方法");
	}

	public String getName() {
	return name;
	}




	public void setName(String name) {
	this.name = name;
	}




	public int getAge() {
	return age;
	}




	public void setAge(int age) {
	this.age = age;
	}




	public void tell(){
	System.out.println("姓名:"+this.getName()+"   年龄：" +this.getAge());
	}
}




