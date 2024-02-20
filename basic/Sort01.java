

// 排序
// 1.内部排序：
// 指将需要处理的所有数据都加载到内部存储器中进行排序，
// 包括（交换式排序、选择式排序、插入式排序）
// 2.外部排序法：
// 数据量过大，无法全部加载到内存中，需要借助外部存储进行排序，
// 包括（合并排序法、直接合并排序法）
// 
// 
// 冒泡排序法：
// 通过对 待排序序列从后向前（从下标较大的元素开始），依次比较相邻元素的值
// ，若发现逆序则交换，使值较大的元素逐渐从前向后部

public class Sort01{
	public static void main(String[] args){
		int arr[]= {24,69,80,57,13};
		int temp ;
		for (int i=0;i<arr.length-1 ;i++) {
			for (int j=0;j<arr.length-1-i ;j++ ) {
				// 若前面大于后面
				if (arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int j=0;j<arr.length ;j++ ) {
			System.out.print(arr[j]+"\t");
		}


	}
}