
public class Methods {
	public static void main(String[] args){
		// ����ʹ��
		// 1.����д�ú������ȥ���ã��������
		// 2.�ȴ���һ������Ȼ����÷���
		Person p1 =new  Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(100);
		int returnRes = p1.getSum(10,20);
		System.out.println("getSum��������ֵ��"+returnRes);

	}
}

class Person {
	String name;
	int age;
	// ����
	// public :��ʾ�����ǹ�����
	// void ����ʾ����û�з���ֵ
	// 
	public void speak(){
		System.out.println("����һ������");
	}

	public void cal01(){
		int res=0;
		for (int i=1;i<=1000 ;i++ ) {
			res+=i	;	
		}	
		System.out.println("�����"+res);
	}

	public void cal02(int n){
		int res=0;
		for (int i=1;i<=n ;i++ ) {
			res+=i	;	
		}	
		System.out.println("���������"+res);
	}

	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	}
}

class Mytools {
	public void printArr(int[][] map){

	}
}

// �����Ķ���
// public ������������ ���������β��б�����{
// ���������
// return ����ֵ
// }

// �����ĺô�
// 1.��ߴ���ĸ�����
// 2.���Խ�ʵ�ֵ�ϸ�ڷ�װ������Ȼ�������û������ü���
// 
// 
// ϸ��
// 1.�������η������Ʒ���ʹ�õķ�Χ
// �����дĬ�Ϸ��ʣ���4�֣�public protected Ĭ�� private��
// 2.�������ͣ�
// һ�����������һ������ֵ��˼������η��ض��������������飩
// ������������
// ������Ҫ������з���ֵ���� return ֵ   ֻҪ��֤��������һ�¼���
// 
// 3.��������void �����Բ�дreturn ����ֻд return
// 4.������Ҫ��һ���ĺ��壬���Լ���֪��
// 
// ����
// 5.����������0���������м��ö��Ÿ���
// 6.������������
// 7.���ô������ķ���ʱ��һ��Ҫ��Ӧ�Ų����б�����ͬ���ͻ�������͵Ĳ���
// 8.����ʱ�Ľ��βΣ�����ʱ�Ľ�ʵ��
// 9.�����в����ٶ��巽��������������Ƕ�׶���
// 
// 
// ��������
// 1.ͬһ�����У�ֱ�ӵ���
// 2.������ã�ͨ������������
// 3.��������뷽���ķ������η��й�
