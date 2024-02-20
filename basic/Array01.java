import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
// 需要掌握的

// 1、数组的使用：创建，查找
// 2、要记住数组一旦创建，大小就无法改变的了
// 3、冒泡排序
		// 数组：可以存放多个 同一类型的数据。
		// 定义：
		// 1、数据类型 数组名[] = new 数据类型[长度];
		// int a[] =  new int[];
		// 2、动态初始化()
		// 先声明：数组类型 数组名[]   ；  数组类型[] 数组名
		// int a[];     int[] a;
		// 再创建数组： 数组名 = new 数组类型[长度];
		// a = new int[10];
		// 
		// 从0开始编号
		// double类型的数组  double[]  
		// 数组名.length  获取数组的长度
		double[] hens =  {3,5,1,3.4,2,50};

		// 遍历数组，求和
		double sum=0;
		for (int i=0;i<hens.length;i++) {
			System.out.println("第"+(i+1)+"个元素的值是"+ hens[i]);
			sum+=hens[i];
		}
		System.out.println("求和是"+ sum);
		System.out.println("平均值是"+ sum/hens.length);
		System.out.println("数组长度是"+ hens.length);

		Scanner myScanner = new Scanner(System.in);
		double scores[] = new double[5];
		for (int i= 0;i<scores.length ;i++ ) {
			System.out.println("请输入第"+(i+1)+"个元素的值");
			scores[i]=myScanner.nextDouble();
		}

		// 输出，遍历数组
		System.out.println("当前数组的元素：");
		for (int i=0;i<scores.length ;i++ ) {
			System.out.println("第"+(i+1)+"个元素的值"+scores[i]);
		}
	}
}