package ch05;

/*
 * 描述：
 * 实现反转字符串
 */
public class StrReverse {

	/*
	 * 一般思路：
	 * 将字符串转换为char数组
	 * 遍历循环给char数组赋值
	 */
	public static String strReverseWithArray(String string){
		
		if(string == null || string.length() == 0){
			return string;
		}
		
		int length = string.length();
		char[] array = string.toCharArray();
		
		for(int i = 0;i < length;i++){
			array[i] = string.charAt(length-1-i);
		}
		return new String(array);
		
	}
	
	/*
	 * 使用递归。
	 * 当反转字符串时，剩下的字符串也是一个反转字符串的过程
	 * 思路：
	 * 找出递归结束的临界条件
	 * 对针对于临界体哦啊见的不同的值作出不同的处理
	 */
	public static String strReverseWithRecursive(String string){
		if(string == null || string.length() == 0){
			return string;
		}
		int length = string.length();
		if(length == 1){
			return string;
		}
		else{
			return strReverseWithRecursive(string.substring(1))+string.charAt(0);
		}
		
		
	}
	
	public static void main(String[] args){
		
		String str = strReverseWithRecursive("1234");
		System.out.println(str);
		
		System.out.println("---");
		
		String str2 = strReverseWithArray("1234");
		System.out.println(str2);
	}
	
	
	
}
