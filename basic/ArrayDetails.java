public class ArrayDetails{
	public static void main(String[] args){
		int num[] = new int[4];
		System.out.println(num[2]);
		int arr[] = {1,22,3232,2};
		double arr1[] = {12,1.23,1312.2};
		char c[] =new char[3];
		System.out.println("char��Ĭ��ֵ��"+c[2]+"---");

		num = arr; 
		System.out.println("num��ֵ"+num );
		System.out.println("arr��ֵ"+arr );
		num[0]+=12;
		System.out.println("num[0]��ֵ"+num[0] );
		System.out.println("arr[0]��ֵ"+arr[0] );
		// ϸ�ڣ�	
		// 1.����������������ͬ
		// 2.�����ڿ����������������ͣ������������ͺ���������
		// 3.���鴴�������û�и�ֵ����Ĭ��ֵ��int 0��short 0��
		// long 0 �� float 0.0 ��double 0.0 ��char \u0000 ��
		// boolean false �� String null 
		// 4.���裺 �������鲢���ٿռ䣻���������Ԫ�ظ�ֵ��ʹ������
		// 5.�����±������ָ����Χ��ʹ�ã����򱨣��±�Խ���쳣
		// 6.���������������ͣ������������Ƕ���object��
		//*7.���鸳ֵʱ������ֵ�ǵ�ַ�����Ի��໥Ӱ��
		// 8.
	}
}