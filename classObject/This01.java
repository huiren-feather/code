// ����֪ʶ������������ʵ��������ô�����������Ժú��˽��� this �ĺ���
// 
// java��������ÿһ���������this������ǰ����
// 
// ������ô��⣺
// �ڶ���ռ䣬�и��������ԣ�this�������ַ
// 
// С��
// �ĸ�������ã�this�ʹ����ĸ�����
public class This01{
	public static void main(String[] args){

		Person p = new Person(28,"Andy");
		System.out.println("p�Ĺ�ϣ��ֵ="+p.hashCode());
		p.info();
		Person p1 = new Person(218,"����");
		System.out.println("p1�Ĺ�ϣ��ֵ="+p1.hashCode());
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
	// ������this�����ݾͽ�ԭ�������age��name�����β�
	public Person(int age , String name){
		this.name=name;
		this.age=age;
	}
	// �������õ�������
	public void info(){
		System.out.println(name + "\t" + age );	
		System.out.println( "this=" + this );	
		System.out.println( "this��hashCode=" + this.hashCode() );	
	}
}

