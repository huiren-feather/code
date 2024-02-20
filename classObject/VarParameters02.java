// 2.可变参数的实参可以为数组，数组的长度就是参数长度，且只能有一个数组
// 
// 4.可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
public class VarParameters02{
	public static void main(String[] args){
		int[] arr = {1,2,3};
		int[] arr1 = {4,2,3};
		T t = new T();
		t.f1(arr); 
		t.f2(arr,arr1); 
	}
}

class T {
	public void f1(int... nums){
		System.out.println("长度="+nums.length);
	}
	public void f2(int[] nums1,int... nums){
		System.out.println("长度="+nums.length);
	}
}