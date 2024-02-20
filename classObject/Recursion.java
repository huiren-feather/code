public class Recursion {
	public static void main(String[] args){
		T t1 = new T();
		t1.test(15);
		int res= t1.factorial(5);
		System.out.println("res="+res);
	}	
}

class T {
	public void test(int n ){
		if (n>2) {
			test(n-1);		
		}
		System.out.println("n="+n);
	}

	public int factorial(int n){
		if (n==1) {
			return 1;	
		}else{
			return factorial(n-1)*n;
		}
	}
}

// �ݹ���Ҫ����
// 1.ִ��һ������ʱ���ʹ���һ���µ��ܱ����Ķ����ռ䣨ջ�ռ䣩
// 2.�����ľֲ������Ƕ����ģ������໥Ӱ��
// 3.���������ʹ�õ����������ͱ������ͻṲ����������͵�����
// 4.�ݹ�������˳��ݹ�������ƽ�������������޵ݹ�
// 5.