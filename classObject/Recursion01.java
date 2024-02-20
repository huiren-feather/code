public class Recursion01 {
	public static void main(String[] args){
		int n=0;
		Rec r = new Rec();
		int res = r.Fibonacci(n);
		if (res != -1) {
			System.out.println(res);
		}

	}
}
// 斐波那契数列
class Rec {
	public int Fibonacci(int n){
		if (n>=1) {
			if (n==1 || n==2) {
				return 1;
			}else{
				return Fibonacci(n-1)+Fibonacci(n-2);
			}
		}else{
			System.out.println("输入有误");
			return -1;
		}


	}
}