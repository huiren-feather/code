// �ɱ��������ʵ��������õ������˽��¸�������ܿ��������С�
// �ɱ����
// ��ͬһ�����ж��ͬ��ͬ���ܵ�����������ͬ�ķ�������װ��һ������
// �����﷨
// �������η� �������� ����������������... �β�����{
// }
// 
// ϸ��
// 1.�ɱ������ʵ�ο���Ϊ0����������
// 2.�ɱ������ʵ�ο���Ϊ���飬����ĳ��Ⱦ��ǲ������ȣ���ֻ����һ������
// 
// 3.�ɱ�����ı��ʾ�������
// 4.�ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
// 5.һ���β��б���ֻ�ܳ���һ���ɱ����
public class VarParameters01{
	public static void main(String[] args){
		AndyMethod am = new AndyMethod();
		int res = am.sum(122,1222);
		System.out.println(res);
	}
}

class AndyMethod {
	// ���Լ���2�����ĺͣ�3�����ĺͣ�4,5.����
	// ����ʹ�÷������أ����Ƚ��鷳
	// public int sum(int n1 , int n2){
	// 	return n1+n2;
	// }
	// public int sum(int n1 , int n2, int n3){
	// 	return n1+n2+n3;
	// }
	// public int sum(int n1 , int n2, int n3, int n4){
	// 	return n1+n2+n3+n4;
	// }
	// ......
	// 
	// ���ϵ���������������ͬ��������ͬ������������ͬ
	// 
	// ���
	// 1.int... ��ʾ���յ��ǿɱ������������int�������Խ��ն��int��0-�����
	// 2.ʹ�ÿɱ����ʱ�����Ե���������ʹ�� �� nums ���Ե�������
	// 3.�������
	public int sum(int... nums){
		System.out.println("���յĲ�������="+nums.length);
		int res=0;
		for (int i=0;i<nums.length ;i++ ) {
			res+=nums[i];
		}
		return res;
	}
}