public class Object01 {
	public static void main(String[] args){
		// 猫类、人类：自定义数据类型
		// 基础数据类型：Java提供数据类型
		// 面向对象：OOP
		// 
		// 1、new Cat()  创建一只猫
		// 2、Cat cat1 = new Cat();  把创建的猫赋给cat1
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		// 怎么使用
		System.out.println("第一只猫信息："+cat1.name+" "+cat1.age+" "+cat1.color);
		System.out.println("第二只猫信息："+cat2.name+" "+cat2.age+" "+cat2.color);
	}	
}


// 使用面向对象的方式，来解决

class Cat {
	String name;
	int age;
	String color ;

}

// 属性，定义方法同变量，  访问修饰符  属性类型 属性名；
// 访问修饰符：控制属性的访问范围
// 可以定义为任意类型
// 若不赋值，有默认值，规则同数组
// 
// 类和对象的内存分配机制
// 1.栈：一般存放基本数据类型（局部变量）
// 2.堆：存放对象（Cat cat，数组等）
// 3.方法区：常量池（常量，比如字符串），类加载信息
// 
// 创建对象流程：
// 1.加载类信息（只会加载一次）
// 2.在堆中分配空间，进行默认初始化，
// 3.把地址赋给p
// 4.进行指定初始化，比如p.name = "Jack"
// 