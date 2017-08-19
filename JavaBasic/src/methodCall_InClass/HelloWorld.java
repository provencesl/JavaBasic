package methodCall_InClass;

public class HelloWorld {

	
    /**
     * 被调用方法,这里使用了static声明为静态方法
     * @param x 
     * @param y
     * @return
     */
	 private static int Add(int x,int y)
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
            result= Add(a,b);            
            
            System.out.println(str+" "+ result);
            
            a+=i;
            
        }
    }

   

}
