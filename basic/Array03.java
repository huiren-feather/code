public class Array03{
	public static void main(String[] args){
		
		int num[] = {4,-1,9,10,23};
		int temp=num[0];
		int index=0;
		for (int i=1;i<num.length ;i++ ) {
			if (temp < num[i]) {
				temp = num[i];
				index = i;
			}
		}
		System.out.println("最大值是"+temp+"索引是"+index);
	}
}