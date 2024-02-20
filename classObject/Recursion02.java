
// 一堆桃子，第一天吃其中的一半，并再多吃一个，以后每天也是如此
// 当到第十天时，想再吃时，发现只有一个桃子
// 问：最初共几个桃子
// 思考：
// 1. i=1 n= s/2-1;
// 2. i=2 n= n/2-1;
// ...  
// i=10 n=1;
public class Recursion02 {
	public static void main(String[] args){
		T t = new T();
		int res=t.Rec(1);
		System.out.println(res);
	}
}

class T {
	public int Rec(int i){
		if (i==10) {
			return 1;
		}else{
			return (Rec(i+1)+1)*2;
		}
	}
}