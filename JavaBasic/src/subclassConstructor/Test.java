package subclassConstructor;

public class Test {
	public static void main(String[] args) {
		/**
		 * A,B中过的value只是名字相同其余都不相同
		 * 
		 * 在类中，与超类中的字段具有相同名称的字段隐藏超类的字段，即使它们的类型不同。
		 */
		B b = new B();
		b.method();//此处调用B类中的method()
	}
}

class A {
	public int value = 1;
	public void method() {
		System.out.println(value);
	}
}

class B extends A {
	public int value = 2;
}
