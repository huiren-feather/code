// 没什么好说的，基础知识，重点。

// 另外，对象的创建细节，初学者可能有些有点难，有点懵也没事吧，
// 后面学习 JVM 时会学到。

// 定义：
// 构造方法，又叫构造器，是类的一种特殊的方法，主要作用是完成对新对象的初始化

// 基本使用：
// 在创建对象时，就直接指定这个对象的属性值

// 基本语法：
// [修饰符]方法名(形参列表){
// 	方法体;
// }

// 特点：
// 1.构造器的修饰符可以默认，也可以是public protected private
// 2.构造器没有返回值
// 3.方法名和类名字必须一样**
// 4.参数列表和成员方法一样的规则
// 5.构造器的调用由系统自动完成

public class Constructor01{
	public static void main(String[] args){
		// 当我们new一个对象时，直接通过构造器指定名称和年龄
		Person p = new Person("Andy",28);
		System.out.println("p的属性如下：");
		System.out.println("p的名称："+p.name);
		System.out.println("p的年龄："+p.age);
	}
}

class Person {
	String name;
	int age =18;
	// 构造器
	// 1.没有返回值，也不能写void
	// 2.名称和类一样
	// 3.
	public Person(String pName,int pAge){
		System.out.println("构造器被调用");
		name=pName;
		age=pAge;
	}
}

// 对象创建的流程分析
// 1.加载Person类信息（Person.class）,只会加载一次，方法区
// 2.在堆中分配空间（地址）
// 3.完成对象初始化
// 3.1 默认初始化 age =0 name = null
// 3.2 显式初始化  age =18 name=null
// 3.3 构造器初始化 age = 28 name = “Andy”
// 4. 把对象在堆中的地址，返回给 p(对象名)