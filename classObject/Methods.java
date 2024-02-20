
public class Methods {
	public static void main(String[] args){
		// 方法使用
		// 1.方法写好后，如果不去调用，不会输出
		// 2.先创建一个对象，然后调用方法
		Person p1 =new  Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(100);
		int returnRes = p1.getSum(10,20);
		System.out.println("getSum方法返回值是"+returnRes);

	}
}

class Person {
	String name;
	int age;
	// 方法
	// public :表示方法是公开的
	// void ：表示方法没有返回值
	// 
	public void speak(){
		System.out.println("我是一个好人");
	}

	public void cal01(){
		int res=0;
		for (int i=1;i<=1000 ;i++ ) {
			res+=i	;	
		}	
		System.out.println("求和是"+res);
	}

	public void cal02(int n){
		int res=0;
		for (int i=1;i<=n ;i++ ) {
			res+=i	;	
		}	
		System.out.println("传参求和是"+res);
	}

	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	}
}

class Mytools {
	public void printArr(int[][] map){

	}
}

// 方法的定义
// public 返回数据类型 方法名（形参列表。。）{
// 方法体语句
// return 返回值
// }

// 方法的好处
// 1.提高代码的复用性
// 2.可以将实现的细节封装起来，然后供其他用户来调用即可
// 
// 
// 细节
// 1.访问修饰符：控制方法使用的范围
// 如果不写默认访问，（4种：public protected 默认 private）
// 2.返回类型：
// 一个方法最多有一个返回值（思考：如何返回多个结果：对象、数组）
// 返回类型任意
// 若方法要求必须有返回值，则 return 值   只要保证数据类型一致即可
// 
// 3.若方法是void ，可以不写return 或者只写 return
// 4.方法名要有一定的含义，可以见名知意
// 
// 参数
// 5.参数可以有0个或多个，中间用逗号隔开
// 6.参数类型任意
// 7.调用带参数的方法时，一定要对应着参数列表传入相同类型或兼容类型的参数
// 8.定义时的叫形参，调用时的叫实参
// 9.方法中不能再定义方法，即方法不能嵌套定义
// 
// 
// 方法调用
// 1.同一个类中，直接调用
// 2.跨类调用，通过对象名调用
// 3.跨类调用与方法的访问修饰符有关
