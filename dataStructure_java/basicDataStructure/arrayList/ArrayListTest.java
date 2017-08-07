package arrayList;

public class ArrayListTest {

	public static void main(String[] arg)
	{
		ListImpl list = new ArrayList();
		for(int i=0; i<10; i++) {
			list.add(new Integer(i));
		}
		list.remove(9);
		System.out.print("size;" + list.size() + "\n");
		System.out.println("isEmpty:" + list.isEmpty());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "    ");
		}
		
		list.add(21);
		list.insert(3, new Integer(5));
		System.out.print("size:" + list.size() + "\n");
		System.out.print("第一次出现5的索引：" + list.indexOf(5) + "\n");
		System.out.print("最后一次出现5的索引：" + list.lastIndexOf(5) + "\n");
		list.set(0, new Integer(30));
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "    ");
		}
	}
}
