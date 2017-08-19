package javaCollection;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo {
	
	/**
	 * 实现哈希表的数据结构
	 * 
	 * 　Hashtable 不可以存入null 键和null 值；但是HashMap 可以存入null 键和null 值。
		hashtable 是线程安全Map 实现；但HashMap 是线程不安全的实现类。所以HashMap 性能比较高点。
	 * @param args
	 */
    public static void main(String[] args)
    {
        Map<String,String> hash  = new HashMap<String, String>() ;
        
//        给HashMap 集合存入null键或者null值
        hash.put("111", null) ; 
        hash.put(null, "1112") ;
//        取出的结果为 1112
        System.out.println(hash.get(null));
        Map<String,String> table = new Hashtable<String, String>() ; 
//        下面的代码会出现运行异常：NullPointerException
        table.put("111", null) ; 
        table.put(null, "1112") ;
        System.out.println(table.get(null));
    }
}