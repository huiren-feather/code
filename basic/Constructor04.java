 public class Constructor04{
	public static void main(String[] args){

		Person p = new Person();
		System.out.println("p.age="+p.age);
		System.out.println("p.name="+p.name);
		Person p1 = new Person(28,"Andy");
		System.out.println("p1.age="+p1.age);
		System.out.println("p1.name="+p1.name);
	}
}

class Person {
	String name;
	int age=20;

	public Person(int pAge,String pName){
		age = pAge;
		name = pName;		
	}
	// �����Ĭ�ϵĹ�����д��������Ȼ�޲����Ķ��󴴽��ͻ�ʧ��
	Person(){
		age = 18;
	}
}

