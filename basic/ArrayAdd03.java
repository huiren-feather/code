import java.util.Scanner;
public class ArrayAdd03 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int nums[] = {10,12,45,90};
		System.out.println("ÇëÊäÈëÐèÒª²åÈëµÄÔªËØ£º");
		int num = myScanner.nextInt();
		int numNew[] = new int[nums.length+1];
		// for (int i=0;i<numNew.length ;i++ ) {
		// 	if ( i<nums.length&&nums[i]<=num ){
		// 		numNew[i]=nums[i];
				
		// 	}else{
		// 		numNew[i]=num;
		// 		for (int j=i+1;j<numNew.length ;j++ ) {
		// 			numNew[j]=nums[j-1];
		// 		}
		// 		break;
		// 	}
		// }
		// nums = numNew;
		// for (int i=0;i<nums.length ;i++ ) {
		// 	System.out.print(nums[i]+"\t");
		// }
		// 1.先确定添加数应该插入到哪个索引
		// 遍历数组，若 insertNum <= arr[i],说明i就是要插入的位置
		// 使用index 保留 index =i；
		// 若遍历完后，没有发现insertNum <=arr[i],说明index = arr.length
		// 2.然后扩容

		
		int index =-1 ;
		for (int i=0;i<nums.length ;i++ ) {
			if(num<=nums[i]){
				index =i;
			    break;
			}

		}
		if (index==-1) {
			index= nums.length;
		}
		numNew[index]=num;
		for (int i=0;i<nums.length ;i++ ) {
			if (i< index) {
				numNew[i]=nums[i];
			}else{
				numNew[i+1]=nums[i];
			}

		}
	    nums = numNew;
		for (int i=0;i<nums.length ;i++ ) {
			System.out.print(nums[i]+"\t");
		}
	}
}