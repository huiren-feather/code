public class ArrayDetails{
	public static void main(String[] args){
		int num[] = new int[4];
		System.out.println(num[2]);
		int arr[] = {1,22,3232,2};
		double arr1[] = {12,1.23,1312.2};
		char c[] =new char[3];
		System.out.println("char的默认值是"+c[2]+"---");

		num = arr; 
		System.out.println("num的值"+num );
		System.out.println("arr的值"+arr );
		num[0]+=12;
		System.out.println("num[0]的值"+num[0] );
		System.out.println("arr[0]的值"+arr[0] );
		// 细节：	
		// 1.数组内数据类型相同
		// 2.数组内可以是任意数据类型，包括基本类型和引用类型
		// 3.数组创建后，如果没有赋值，有默认值：int 0；short 0；
		// long 0 ； float 0.0 ；double 0.0 ；char \u0000 ；
		// boolean false ； String null 
		// 4.步骤： 声明数组并开辟空间；给数组各个元素赋值；使用数组
		// 5.数组下标必须在指定范围内使用，否则报：下标越界异常
		// 6.数组属于引用类型，数组型数据是对象（object）
		//*7.数组赋值时，赋的值是地址，所以会相互影响
		// 8.
	}
}