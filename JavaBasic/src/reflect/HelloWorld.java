package reflect;

 class Person {

	 /**
	  * Class实例化其他类对象时，
	  * 一定要自己定义无参构造函数
	  */
	private String name;
	private int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
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
	
    @Override
    public String toString(){
    	return "["+this.name+" "+this.age+"]";
    }
    
}

class HelloWorld{
	public static void main(String[] args){
		Class<?> demo = null;
		try{
			demo = Class.forName("reflect.Person");
		}catch(Exception e){
			e.printStackTrace();
		}
		Person person =null;
		try{
			person = (Person)demo.newInstance();
		}
		catch (InstantiationException e) {
			// TODO: handle exception
	    e.printStackTrace();
			
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
		}
		person.setName("Rollen");
		person.setAge(20);
		System.out.println(person);
	}
}
