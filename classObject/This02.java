// this��ע�������ʹ��ϸ��
// 1.this�ؼ��ֿ����������ʱ�������ԡ�������������
// 2.this��������ǰ������Ժ;ֲ�����
// 3.���ʳ�Ա�������﷨��this.�������������б�
// 4.���ʹ������﷨��this(�����б�)����仰������ڹ������ĵ�һ�仰
// ע�⣺ֻ���ڹ�������ʹ�� ����ֻ���ڹ������з�������һ����������
// 5.this�������ඨ����ⲿʹ�ã�ֻ�����ඨ��ķ�����ʹ��

public class This02{
	public static void main(String[] args){

		T t1 = new T();
		t1.f2();
	}
}

class T{

	public T() {
		// ������� T(String name, int age),��仰������ڹ��췽���ĵ�һ�仰
		this("Andy",28);
		System.out.println("T() ������");

	}
	public T(String name, int age) {
		System.out.println("T(String name, int age) ������");
	}

	public void f1(){
		System.out.println("f1() ����");

	}

	public void f2(){
		System.out.println("f2() ����");
		// �������f1����
		// ��һ�ַ�ʽ
		f1();
		// �ڶ��ַ�ʽ
		this.f1();
	}
}
