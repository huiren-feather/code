public class For01 {
	public static void main(String[] args){
		int sum = 0 ;
		int i=1;
		for (;(i*9)<=100 ;i++ ) {
			sum += i*9;
			System.out.println( "9的倍数："+i*9);
		}
		--i;
		System.out.println("个数为:"+i);
		System.out.println("总和为"+sum);
	}
}
// 1.化繁为简：
// 完成输出1-100
// 输出9的倍数，进行过滤
// 统计个数 定义一个变量 int count = 0；当条件满足时 count++