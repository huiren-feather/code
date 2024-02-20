public class Recursion {
	public static void main(String[] args){
		T t1 = new T();
		t1.test(15);
		int res= t1.factorial(5);
		System.out.println("res="+res);
	}	
}

class T {
	public void test(int n ){
		if (n>2) {
			test(n-1);		
		}
		System.out.println("n="+n);
	}

	public int factorial(int n){
		if (n==1) {
			return 1;	
		}else{
			return factorial(n-1)*n;
		}
	}
}

// 递归重要规则
// 1.执行一个方法时，就创建一个新的受保护的独立空间（栈空间）
// 2.方法的局部变量是独立的，不会相互影响
// 3.如果方法中使用的是引用类型变量，就会共享该引用类型的数据
// 4.递归必须向退出递归的条件逼近，否则就是无限递归
// 5.