// 作用域：这个比较重要，就是变量的作用范围，以及变量的生命周期，好好看下
// 1.在java中，主要的变量就是属性（成员变量）和局部变量
// 2.我们说的局部变量一般指在成员方法中定义的变量。
// 3.java中作用域的分类：
// 全局变量：也就是属性，作用域为整个类
// 局部变量：除了属性之外的其他变量，作用域为定义它的代码块中
// 4.全局变量可以不赋值，直接使用，因为有默认值，
// 局部变量必须赋值后，才能使用，因为没有默认值

public class VarScope{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.eat();
		Person p = new Person();
		p.say();
	}
} 

class Cat {
	// age是属性，是全局变量，作用域为整个Cat类：cry eat等方法中
	int age = 10;

	{
		// num 在代码块中，是局部变量，只能在代码块中使用
		int num =100;
	}
	public void cry(){
		// n name 都是局部变量，作用域在cry中
		int n=10;
		String name ="Jakie";
	}

	public void eat(){
		System.out.println("age="+age);
	}
}
// 细节：
// 1.属性和局部变量可以重名，访问时遵循就近原则
// 2.在同一个作用域中，比如在同一个成员方法中，两个局部变量不能重名
// 3.属性生命周期较长，伴随着对象的创建二创建，伴随着对象的销毁而销毁。
// 局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁
// 即在一次方法调用的过程中
// 4.作用域方法不同
// 全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）
// 局部变量：只能在本类中对应的方法中使用
// 5.修饰符不同
// 全局变量/属性：可以加修饰符
// 局部变量：不可以加修饰符
class Person {
	String name = "Jack";
	public void say(){
		// String name = "Andy";
		System.out.println("say() name = "+name);

		Cat cat= new Cat();
	    cat.eat();
	    System.out.println(cat.age);
	}

}