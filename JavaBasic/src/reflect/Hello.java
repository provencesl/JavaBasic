package reflect;

/**
 * 通过一个对象获得完整的包名和类名
 * */
 class Demo{
    //other codes...
}
 
public class Hello{
    public static void main(String[] args) {
       // Hello demo=new Hello();  reflect.Hello
        Demo demo =new Demo();     //reflect.Demo 
    	System.out.println(demo.getClass().getName());
    }
}