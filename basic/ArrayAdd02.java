import java.util.Scanner;
public class ArrayAdd02 {
	public static  void main(String[] args){
		// 数组扩容
		
		// {1,2,3}  -->  {1,2,3,4}
		// 思路分析：
		// 1.定义一个新数组 ，长度为元素组长度加上需要扩大的长度
		// 2.依次遍历原数组，把值拷贝给新数组
		// 3.将多出的元素依次赋值给新数组
		// 4.最后让原数组指向新数组，原数组就被销毁了
		// 5.创建一个Scanner可以接受用户输入
		// 6.因为用户什么时候退出不确定，使用do-while + break 来控制
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1,2,3};

		do{
			int arrNew[] = new int[arr.length+1];
			// 遍历原数组，将数据拷贝到新数组
			for (int i=0;i<arr.length ; i++) {
				arrNew[i]=arr[i];
			}
			// 输入一个数据
		 	System.out.println("请输入你要添加的元素：");
			int addNum=myScanner.nextInt();
			// 把输入的数据赋给新数组的最后一个位置
			arrNew[arrNew.length-1]=addNum;
 			// 输出，看效果
			arr=arrNew;
			for (int i=0;i<arr.length ; i++) {
				System.out.print(arr[i]+"\t");
			}
			// 问用户是否继续
			System.out.println("\n是否继续输入：y/n");
			char judge = myScanner.next().charAt(0); 
			if (judge == 'n') {
				System.out.println("数组扩容完毕");
				break;
			}
		}while(true);

	}
}