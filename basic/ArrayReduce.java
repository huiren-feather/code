import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args){
		// 数组缩减
		// 1.循环，把前length-1个元素赋值给新数组,再把原数组指向新数组
		// 2.提示，是否继续添加，若是，进行下一个循环，执行步骤1；若否，跳出循环
		// 3.输出缩减后数组
		int arr[] = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		do{
			int arrNew[] = new int[arr.length-1];
			for (int i=0;i<arr.length-1 ;i++ ) {
				arrNew[i]=arr[i];
			}
			arr=arrNew;
			for (int i=0;i<arr.length ;i++ ) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println("\n是否继续缩减：y/n");
			char judge = myScanner.next().charAt(0);
			if (judge == 'n') {
				System.out.println("\n停止缩减");
				break;
			}
			if (arr.length == 1) {
				System.out.println("\n只剩一个元素，不能缩减");
				break;
			}
		}while(arr.length>1);

	}
}