public class ArrayCopy{
	public static void main(String[] args){
		// ���鿽������֤��ַ��һ��������Ӱ��
		int num[] =  {10,20,30};
		int num1[] = new int[num.length];
		
		for (int i=0;i<num.length ;i++ ) {
			num1[i]=num[i];
		}
		System.out.println("num��ֵ"+num );
		System.out.println("num1��ֵ"+num1 );
		num[0]+=12;
		System.out.println("num[0]��ֵ"+num[0] );
		System.out.println("num1[0]��ֵ"+num1[0] );
	}
}