public class ArrayReverse{
	public static void main(String[] args){
		int arr[] = {11,22,33,44,55,66};
		 // 数组反转的两种方法
		//1. i  与  arr.length-1-i  互换
		int temp ;
		for (int i=0;i<(arr.length/2) ;i++ ) {
			temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}

		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}


		// 2. 逆序赋值，增加一个数组，然后直接把地址赋值给原数组即可
	}
}