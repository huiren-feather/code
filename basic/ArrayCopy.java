public class ArrayCopy{
	public static void main(String[] args){
		// 数组拷贝，保证地址不一样，互不影响
		int num[] =  {10,20,30};
		int num1[] = new int[num.length];
		
		for (int i=0;i<num.length ;i++ ) {
			num1[i]=num[i];
		}
		System.out.println("num的值"+num );
		System.out.println("num1的值"+num1 );
		num[0]+=12;
		System.out.println("num[0]的值"+num[0] );
		System.out.println("num1[0]的值"+num1[0] );
	}
}