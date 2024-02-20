public class YangHui{
	public static void main(String[] args){
		// 杨辉三角
		// 1.第一行有1个元素，第n行有n 个元素
		// 2.每一行的第一个元素和最后一个元素都是1
		// 3.从第三行开始，对于非第一个元素和最后一个元素的值：
		// arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		// 
		int yanghui[][] =new int[10][];
		for (int i=0;i<yanghui.length ;i++ ) {
			yanghui[i]=new int[i+1];
			for (int j=0;j<yanghui[i].length ;j++ ) {
				if (j==0 || j==yanghui[i].length-1) {
					yanghui[i][j]=1;
				}else {
					yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
				}
			}
		}

		for (int i=0 ;i<yanghui.length ;i++ ) {
			for (int j=0;j<yanghui[i].length ;j++ ) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}

		//虽然赋值的是地址，但是二维数组还是不能赋给一维数组 ，why？？
		int a[]=new int[10];
		System.out.println(a);
		System.out.println(yanghui);
		// 好像地址长度是不一样的，主要原因是：赋值后a就不是一维数组了
		// a=yanghui;
	}

}