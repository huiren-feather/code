public class ArrayAdd {
	public static  void main(String[] args){
		// ��������
		
		// {1,2,3}  -->  {1,2,3,4}
		// ˼·������
		// 1.����һ�������� ������ΪԪ���鳤�ȼ�����Ҫ����ĳ���
		// 2.���α���ԭ���飬��ֵ������������
		// 3.�������Ԫ�����θ�ֵ��������
		// 4.�����ԭ����ָ�������飬ԭ����ͱ�������
		int arr[] = {1,2,3};
		int temp=4;
		int arrNew[] = new int[arr.length+1];
		for (int i=0;i<arr.length ; i++) {
			arrNew[i]=arr[i];
		}
		arrNew[arr.length]=temp;
		for (int i=0;i<arrNew.length ; i++) {
			System.out.print(arrNew[i]+"\t");
		}
		
		arr=arrNew;
		for (int i=0;i<arr.length ; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}