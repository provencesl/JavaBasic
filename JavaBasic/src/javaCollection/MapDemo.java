package javaCollection;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {
	
	/**
	 * Map中的key不可重复，并且具有唯一性
	 * 
	 * 1、添加：
　　> V put(K key, V value) : 添加一个key-value 对，如果当前Map中已有一个与该key 相等的key-value 对，则新的key-value 对会覆盖原来的，并返回原来的value。
　　> void putAll(Map<? extends K,? extends V> m)  从指定映射中将所有映射关系复制到此映射中。

　　2、删除：
　　> void clear() : 从此映射中移除所有映射关系 。
　　> V remove(Object key)  如果存在一个键的映射关系，则将其从此映射中移除 , 并返回 value 。

　　3、判断：
　　> boolean containsKey(Object key) :如果Map 中包含指定key ，则返回 true。
　　> boolean containsValue(Object value) : 如果Map 中包含一个或多个value ， 则返回true。
　　> boolean isEmpty() : 如果Map 为空，则返回true 。

　　4、获取：
　　> V get(Object key) 返回key 对应的value , 如果没有则返回null 。
　　> int size() 返回Map 中 key-value 对的个数。
　　> Collection values() : 返回该Map 里所有value 组成的Collection 。 
	 * @param args
	 */
    public static void main(String[] args)
    {
//        定义个 HashMap 集合， key 和 value的类型都为String。
        Map<String, String> map = new HashMap<String, String>() ; 
//        添加元素
        map.put("Java", "语言") ;
        map.put("JSP", "视图View") ; 
        map.put("JavaBean", "模型Model") ; 
        map.put("Servlet", "控制层Controller") ; 
        System.out.println(map); 
        System.out.println(map.put("MVC形式", "Model2形式"));
        System.out.println(map);
//        删除元素
        System.out.println(map.remove("Java") );
        System.out.println(map);
//        获取元素
        System.out.println(map.get("JSP")); 
//        获取元素个数
        System.out.println(map.size());
//        判断
        System.out.println(map.containsKey("Servlet"));
    }
}