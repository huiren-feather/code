public class ArrayAdd {
	public static  void main(String[] args){
		// 数组扩容
		
		// {1,2,3}  -->  {1,2,3,4}
		// 思路分析：
		// 1.定义一个新数组 ，长度为元素组长度加上需要扩大的长度
		// 2.依次遍历原数组，把值拷贝给新数组
		// 3.将多出的元素依次赋值给新数组
		// 4.最后让原数组指向新数组，原数组就被销毁了
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