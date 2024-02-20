public class Methods01 {
	public static void main(String[] args){
		AA a = new AA();
		int n =2;
		boolean b = a.Judge(n);
		System.out.println(b);

		BB bb = new BB();
		int r =3,col=6;
		char c = '@';
		bb.print(r,col,c);
	}
}

class AA {
	public boolean Judge(int num) {
		boolean b ;
		if (num%2 == 0) {
		 	b=true;
		 }else {
		 	b= false;
		 }
		return b;
	}
}

// 做题思路：
// 1.方法的返回类型void 
// 2.方法的名字
// 3.方法的形参  
// 4.方法体，循环
// 
class BB {
	public void print(int row,int col,char c){
		for (int i=0;i<row ; i++) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}

// 方法的传参机制：
// 
// 基本数据类型：
// 形参的任何改变不影响实参
// 
// 引用数据类型：
// 传的是地址，所有实参和形参同样变化