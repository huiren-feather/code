// 注意事项和使用细节：
// 1.一个类可以定义多个不同的构造器，即构造器重载
// 2.构造器名和类名要相同
// 3.构造器没有返回值
// 4.构造器是完成对象的初始化，并不是创建对象
// 5.在创建对象时，系统自动的调用该类的构造方法
// 6.如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造方法，
// 使用javap指令，反编译看看
 public class Constructor02{
	public static void main(String[] args){

		Person p = new Person("Andy",28);
		System.out.println("p的属性如下：");
		System.out.println("p的名称："+p.name);
		System.out.println("p的年龄："+p.age);

		Person p1 = new Person("向阳");
		System.out.println("p1的属性如下：");
		System.out.println("p1的名称："+p1.name);
		System.out.println("p1的年龄："+p1.age);
	}
}

class Person {
	String name;
	int age;
	// 第一个构造器
	public Person(String pName,int pAge){
		System.out.println("第一个构造器被调用");
		name=pName;
		age=pAge;
	}
	// 第二个构造器
	public Person(String pName){
		System.out.println("第二个构造器被调用");
		name=pName;
	}
}

