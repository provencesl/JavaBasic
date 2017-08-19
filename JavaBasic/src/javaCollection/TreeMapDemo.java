package javaCollection;


import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	//TreeMap<String,String> map = new TreeMap<String,String>();

	CollatorComparator comparator = new CollatorComparator();  
	TreeMap map = new TreeMap(comparator); 
	for(int i=0; i<10; i++) {
	String  s = ""+(int)(Math.random()*1000);
	map.put(s,s);
	}

	map.put("bbb","bbb");
	map.put("BBBB", "BBBB");
	map.put("北京","北京");
	map.put("中国","中国");
	map.put("上海", "上海");

	Collection col = map.values();
	Iterator it = col.iterator();

	while(it.hasNext()) {
	System.out.println(it.next());

	} 
}
}
