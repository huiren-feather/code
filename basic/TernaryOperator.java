public class TernaryOperator{
	public static void main(String[] args){
		int a =  10;
		int b = 80;
		// 后计算，先返回在计算
		int res =  a > b ? a++ : b--;
		System.out.println(res);

		int c = 40;
		// a,b,c最大值
		int max = c>(a>b?a:b) ? c :(a>b?a:b) ; //推荐拆开；后面有更好的方法
		System.out.println("max= "+max);

		
	}
}