public class Object01 {
	public static void main(String[] args){
		// è�ࡢ���ࣺ�Զ�����������
		// �����������ͣ�Java�ṩ��������
		// �������OOP
		// 
		// 1��new Cat()  ����һֻè
		// 2��Cat cat1 = new Cat();  �Ѵ�����è����cat1
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";

		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 100;
		cat2.color = "��ɫ";

		// ��ôʹ��
		System.out.println("��һֻè��Ϣ��"+cat1.name+" "+cat1.age+" "+cat1.color);
		System.out.println("�ڶ�ֻè��Ϣ��"+cat2.name+" "+cat2.age+" "+cat2.color);
	}	
}


// ʹ���������ķ�ʽ�������

class Cat {
	String name;
	int age;
	String color ;

}

// ���ԣ����巽��ͬ������  �������η�  �������� ��������
// �������η����������Եķ��ʷ�Χ
// ���Զ���Ϊ��������
// ������ֵ����Ĭ��ֵ������ͬ����
// 
// ��Ͷ�����ڴ�������
// 1.ջ��һ���Ż����������ͣ��ֲ�������
// 2.�ѣ���Ŷ���Cat cat������ȣ�
// 3.�������������أ������������ַ��������������Ϣ
// 
// �����������̣�
// 1.��������Ϣ��ֻ�����һ�Σ�
// 2.�ڶ��з���ռ䣬����Ĭ�ϳ�ʼ����
// 3.�ѵ�ַ����p
// 4.����ָ����ʼ��������p.name = "Jack"
// 