package ch05;


/*
 * 描述：
 * 实现句子中的单词逆序输出
 */
public class WordReverse {

	public static String reverseWord(String sentence){
		StringBuilder sb = new StringBuilder(sentence.length());
		//返回数组
		String[] words = sentence.split(" ");
		//添加“ ”并且逆序输出
		for(int i = words.length - 1;i>=0;i--){
			sb.append(words[i]).append(' ');
		}
		//StringBuilder转换格式为String
		sb.setLength(sb.length() - 1);
		return sb.toString();
	}
	
	public static void main(String[] args){
		
		String str = "dog cat apple";
		String reverseStr = reverseWord(str);
		System.out.println(reverseStr);
	}
	
	
	
}
