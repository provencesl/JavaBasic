package queue;

public class Experiment
{
    public static void main(String[] args)
    {
        Test1.sayStatic();
        Test1 test = new Test1();
        test.sayInstance();
    }
}
class Test1
{
    public static void sayStatic()
    {
        System.out.println("这是一个静态方法。");
    }
    public void sayInstance()
    {
        System.out.println("这是一个实例方法。");
    }
}
