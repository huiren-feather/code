// 注意事项和使用细节：
// 1.一个类可以定义多个不同的构造器，即构造器重载
// 2.构造器名和类名要相同
// 3.构造器没有返回值
// 4.构造器是完成对象的初始化，并不是创建对象
// 5.在创建对象时，系统自动的调用该类的构造方法
// 6.如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造方法，
// 使用javap指令，反编译看看:  javap Person.class
// 反编译 class -->  java文件
// 
// 7.一旦定义了自己的构造器，默认的构造器就被覆盖了，就不能再使用默认的无参构造器，
// 除非显示的定义一下
 public class Constructor03{
	public static void main(String[] args){

		Person p = new Person();
	}
}

class Person {
	String name;
	int age;
	/*
	默认构造器
	Person() {
	
	}	
	 */ 
	public Person(int pAge){

	}
	// 必须把默认的构造器写出来，不然无参数的对象创建就会失败
	Person(){}
}

