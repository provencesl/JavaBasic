package stringAndStringBuffer;

public class StringAndStringBufferSwitch {
	 public static void main(String[] args) {
	        //String -> StringBuffer
	        //创建一个String对象
	        String str = "Hi Java!";
	        System.out.println(str);
	 
	        //方式一：构造方法
	        StringBuffer buffer = new StringBuffer(str);
	        System.out.println(buffer);
	 
	        //方式二：通过append方法
	        StringBuffer buffer2 = new StringBuffer();
	        buffer2.append(str);
	        System.out.println(buffer2);
	 
	        //StringBuffer -> String
	        //创建一个StringBuffer对象
	        StringBuffer buffer3 = new StringBuffer();
	        buffer3.append("Happy birthday Java!");
	        System.out.println(buffer3);
	 
	        //方式一：通过构造方法
	        String str2 = new String(buffer3); 
	        System.out.println(str2);
	         
	        //方式二：通过toString方法
	        String str3 = buffer3.toString();
	        System.out.println(str3);
	    }
}
