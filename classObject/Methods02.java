public class Methods02 {
	public static void main(String[] args){
		B b=new B();
		int[] arr = {1,2,3};
		b.test(arr);
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print("实参数组："+arr[i]+" ");
		}
		System.out.println( );
	}
}

class B {
	public void test(int[] arr){
		arr[0] = 200;
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print("形参数组："+arr[i]+" ");
		}
		System.out.println( );
	}
}