public class Work02{
	public static void main(String[] args){

	}
}
// ����������������
// 1.���� �Ա� ���� ְλ нˮ
// 2.���� �Ա� ����
// 3.ְλ нˮ

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
	// ���ù�����
	public Employee(String name ,char gender,int age,String job,double sal){
		this(name , gender, age);
		this.job=job;
		this.sal=sal;
	}
}