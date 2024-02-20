public class Array04 {
	public static void main(String[] args){
		// 思路
		// 1.生成10个随机数，并保存到数组
		// 定义数组，循环遍历数组，每生成一个随机数，就保存到数组
		int arr[] = new int [10];
		int random;
		for (int i=0;i<arr.length ;i++ ) {
			random = (int)(Math.random()*100)+1;
			arr[i]=random;
		}
		for (int i=0 ;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
		// 2.倒序打印以及求平均值、最大值、最大值下标、并查找是否有8
		// 倒序打印，冒泡排序，第i轮比较length-i个数，比较length-1轮
		// 最大值即是第一个数，下标为0
		// 查找是否8，即遍历排序后的数组进行遍历，比较是否大于8，
		// 若是，继续；若否，比较是否等于8，若是，提示有8，并退出循环
		// 若否，提示无8，并退出循环
		int temp=-1 ;
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=0;j<arr.length-i-1 ;j++ ) {
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}			
		System.out.println("\n倒序排序后数组：");
		int index =-1;
		int sum =0;
		for (int i=0 ;i<arr.length ;i++ ) {
			if (arr[i]==8) {
				index =i;
			}
			sum+=arr[i];
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n最大值是"+arr[0]+",下标是0");
		System.out.println("平均值值是"+(sum/arr.length));
		if (index!=-1) {
			System.out.println("数组中有8，下标为"+arr[index]);
		}else{
			System.out.println("数组中无8 " );

		}
		

	}
}