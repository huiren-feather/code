// 基础知识，但是面试其实基本不怎么考，不过可以好好了解下 this 的含义
// 
// java虚拟机会给每一个对象分配this，代表当前对象
// 
// 可以这么理解：
// 在对象空间，有个隐藏属性，this：对象地址
// 
// 小结
// 哪个对象调用，this就代表哪个对象
public class This01{
	public static void main(String[] args){

		Person p = new Person(28,"Andy");
		System.out.println("p的哈希码值="+p.hashCode());
		p.info();
		Person p1 = new Person(218,"向阳");
		System.out.println("p1的哈希码值="+p1.hashCode());
		p1.info();
	}
}

class Person {
	String name;
	int age;

	// public Person(int pAge , String pName){
	// 	name=pName;
	// 	age=pAge;
	// }
	// 
	// 若不加this，根据就近原则，里面的age和name都是形参
	public Person(int age , String name){
		this.name=name;
		this.age=age;
	}
	// 而这里用的是属性
	public void info(){
		System.out.println(name + "\t" + age );	
		System.out.println( "this=" + this );	
		System.out.println( "this的hashCode=" + this.hashCode() );	
	}
}

