package reflect;

import java.lang.reflect.Constructor;

class Stu{
	
	private String name;
	private int age;
	
	public Stu(){
		
	}
	
	public Stu(String name){
		this.name=name;
	}
	
	public Stu(int age){
		this.age = age;
		
	}
	
	public Stu(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
		
	}
	
	@Override
	public String toString(){
		return "["+this.name+" "+this.age+"]";
		
	}
}


/**
 * @author sunlei
 *
 */
public class Student {

	public static void main(String[] args) {  
        Class<?> demo = null;  
        try {  
            demo = Class.forName("reflect.Stu");  
            Constructor cons0 = demo.getConstructor();  
            Constructor cons1 = demo.getConstructor(String.class);  
            Constructor cons2 = demo.getConstructor(int.class);  
            Constructor cons3 = demo.getConstructor(String.class,int.class);  
               
            Student per1 = (Student) cons0.newInstance();  
            Student per2 = (Student) cons1.newInstance("Rollen");  
            Student per3 = (Student) cons2.newInstance(20);  
            Student per4 = (Student) cons3.newInstance("Rollen", 20);  
               
            System.out.println(per1);  
            System.out.println(per2);  
            System.out.println(per3);  
            System.out.println(per4);  
        }  
        catch (Exception e) {  
            e.printStackTrace();  
        }         
    }  
	
/*	public static void main(String[] args){
		Class<?> demo =null;
		
		try{
			demo = Class.forName("reflect.Stu");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Stu stu1=null;
		Stu stu2=null;
		Stu stu3=null;
		Stu stu4=null;
		*//**
		 * 取得全部构造函数
		 * 
		 *//*
		Constructor<?> cons[] = demo.getConstructors();
		try{
			stu1 =(Stu)cons[0].newInstance();
			stu2 =(Stu)cons[1].newInstance("provencesl");
			stu3 =(Stu)cons[2].newInstance(20);
			stu4 =(Stu)cons[3].newInstance("provencesl",20);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		
	}
	*/
}
