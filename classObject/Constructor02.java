// ע�������ʹ��ϸ�ڣ�
// 1.һ������Զ�������ͬ�Ĺ�������������������
// 2.��������������Ҫ��ͬ
// 3.������û�з���ֵ
// 4.����������ɶ���ĳ�ʼ���������Ǵ�������
// 5.�ڴ�������ʱ��ϵͳ�Զ��ĵ��ø���Ĺ��췽��
// 6.�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι��췽����
// ʹ��javapָ������뿴��
 public class Constructor02{
	public static void main(String[] args){

		Person p = new Person("Andy",28);
		System.out.println("p���������£�");
		System.out.println("p�����ƣ�"+p.name);
		System.out.println("p�����䣺"+p.age);

		Person p1 = new Person("����");
		System.out.println("p1���������£�");
		System.out.println("p1�����ƣ�"+p1.name);
		System.out.println("p1�����䣺"+p1.age);
	}
}

class Person {
	String name;
	int age;
	// ��һ��������
	public Person(String pName,int pAge){
		System.out.println("��һ��������������");
		name=pName;
		age=pAge;
	}
	// �ڶ���������
	public Person(String pName){
		System.out.println("�ڶ���������������");
		name=pName;
	}
}

