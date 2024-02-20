// this的注意事项和使用细节
// 1.this关键字可以用来访问本类的属性、方法、构造器
// 2.this用于区别当前类的属性和局部变量
// 3.访问成员方法的语法：this.方法名（参数列表）
// 4.访问构造器语法：this(参数列表)；这句话必须放在构造器的第一句话
// 注意：只能在构造器中使用 （即只能在构造器中访问另外一个构造器）
// 5.this不能在类定义的外部使用，只能在类定义的方法中使用

public class This02{
	public static void main(String[] args){

		T t1 = new T();
		t1.f2();
	}
}

class T{

	public T() {
		// 这里访问 T(String name, int age),这句话必须放在构造方法的第一句话
		this("Andy",28);
		System.out.println("T() 构造器");

	}
	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器");
	}

	public void f1(){
		System.out.println("f1() 方法");

	}

	public void f2(){
		System.out.println("f2() 方法");
		// 调用类的f1方法
		// 第一种方式
		f1();
		// 第二种方式
		this.f1();
	}
}
