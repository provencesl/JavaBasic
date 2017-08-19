package stringAndStringBuffer;

public class Solution {
  
	/*    public String reverseString(String s) {
        String rev = "";
        for(int i = s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }
        return rev;          //170466ns
    }    */
    
	 public String reverseString(String s) {
	        StringBuffer rev = new StringBuffer();
	        for(int i = s.length()-1; i >= 0; i--){
	            rev.append(s.charAt(i));//charAt()返回指定索引的char值
	        }
	        return rev.toString();
	    }                    //165111ns
	 
    public static void main(String[] args){
  
    	/**
    	 * String对象本身是一个常量，不可改变
    	 * 但是Java中对他们进行了封装，使得他们可以进行操作
    	 * 如Strign s="abc"
    	 * 		s+=="def"
    	 * 当我们执行 s += "def"; 时，并不是说 s 的内容直接由"abc"变为了"abcdef"，
    	 * "abc"仍是"abc","def"会被暂时存储到一块新的内存里，然后再开辟一个新的内存空间，
    	 * 把"abc"和"def"拷贝到这个内存空间，然后 s 指向这个新的内存空间。
			这个过程其实就是new了一个新的String对象，新对象是"abcdef"，s 抛弃了原来的对象，指向了新对象。
			由于每次操作都要重新new一个对象，并且占用大量内存，因此String类的效率不高。
    	 */
    	
    	
    	
    	
    	/**
    	 * StringBuffer对象是一个长度可变的对象，当对StringBuffer的进行增加或删除时，
    	 * 不需要new一个对象，可以动态地修改堆内存。
    	 */
    	
   // 	long startTime = System.currentTimeMillis();    //获取开始时间
    	
    	long startTime=System.nanoTime();   //获取开始时间  
    	
    	
    	String str="string",nowstring;
    	Solution solution = new Solution();
    	nowstring=solution.reverseString(str);
    	System.out.println(nowstring);
    	
    	long endTime=System.nanoTime(); //获取结束时间  
    	System.out.println("程序运行时间： "+(endTime-startTime)+"ns"); 
    	
    //	long endTime = System.currentTimeMillis();    //获取结束时间
    	
    //  System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    	
    	
    }
}
