public class Work02{
	public static void main(String[] args){

	}
}
// 定义三个构造器：
// 1.名字 性别 年龄 职位 薪水
// 2.名字 性别 年龄
// 3.职位 薪水

class Employee{
	String name ;
	char gender;
	int age;
	String job;
	double sal;

	public Employee(String name ,char gender,int age){
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public Employee(String job,double sal){
		this.job=job;
		this.sal=sal;
	}
	// 复用构造器
	public Employee(String name ,char gender,int age,String job,double sal){
		this(name , gender, age);
		this.job=job;
		this.sal=sal;
	}
}