// 2.�ɱ������ʵ�ο���Ϊ���飬����ĳ��Ⱦ��ǲ������ȣ���ֻ����һ������
// 
// 4.�ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
public class VarParameters02{
	public static void main(String[] args){
		int[] arr = {1,2,3};
		int[] arr1 = {4,2,3};
		T t = new T();
		t.f1(arr); 
		t.f2(arr,arr1); 
	}
}

class T {
	public void f1(int... nums){
		System.out.println("����="+nums.length);
	}
	public void f2(int[] nums1,int... nums){
		System.out.println("����="+nums.length);
	}
}