package methodCall_InClass;

public class Hello {
	
	/**
     * 被调用方法,没被static修饰，不是静态方法。调用时需要通过类的实例化进行调用
     * @param x 
     * @param y
     * @return
     */
    private int Add(int x,int y)
    {
        
        return x+y;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str="HelloWord!";
        int a=0;
        int b=1;
        int result=0;
        
        for(int i=0;i<3;i++)
        {
            //Add方法调用
            //类的实例化
            Hello helloword=new Hello();
            
            //通过实例化的类进行Add方法调用
            result=helloword.Add(a, b);                        
            
            System.out.println(str+" "+ result);
            
            a+=i;
            
        }
    }
    
}