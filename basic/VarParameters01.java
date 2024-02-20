// 可变参数：其实这个很少用到，简单了解下概念，看到能看看懂就行。
// 可变参数
// 将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法
// 基本语法
// 访问修饰符 返回类型 方法名（数据类型... 形参名）{
// }
// 
// 细节
// 1.可变参数的实参可以为0个或任意多个
// 2.可变参数的实参可以为数组，数组的长度就是参数长度，且只能有一个数组
// 
// 3.可变参数的本质就是数组
// 4.可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
// 5.一个形参列表中只能出现一个可变参数
public class VarParameters01{
	public static void main(String[] args){
		AndyMethod am = new AndyMethod();
		int res = am.sum(122,1222);
		System.out.println(res);
	}
}

class AndyMethod {
	// 可以计算2个数的和，3个数的和，4,5.。。
	// 可以使用方法重载，但比较麻烦
	// public int sum(int n1 , int n2){
	// 	return n1+n2;
	// }
	// public int sum(int n1 , int n2, int n3){
	// 	return n1+n2+n3;
	// }
	// public int sum(int n1 , int n2, int n3, int n4){
	// 	return n1+n2+n3+n4;
	// }
	// ......
	// 
	// 以上的三个方法名称相同，功能相同，参数个数不同
	// 
	// 解读
	// 1.int... 表示接收的是可变参数，类型是int，即可以接收多个int（0-多个）
	// 2.使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
	// 3.遍历求和
	public int sum(int... nums){
		System.out.println("接收的参数个数="+nums.length);
		int res=0;
		for (int i=0;i<nums.length ;i++ ) {
			res+=nums[i];
		}
		return res;
	}
}