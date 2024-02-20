public class FloatDetail{
	public static void main(String[] args){

		// float num1 = 1.1;  //默认是double。所以会报错 
		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1F;

		System.out.println(5.12e2);

		double num5 = 1.232142345234532432;
		float num6 = 1.232142345234532432F;

		System.out.println(num5);
		System.out.println(num6);

		// 浮点数使用陷阱
		// 当运算结果是小数的进行相等判断时，要注意
		// 应该是以两个数的差值的绝对值，在某个精度范围内进行判断
		double num7 = 2.7;
		double num8 = 8.1/3;
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(Math.abs(num7-num8));
		if (Math.abs(num7-num8)<0.00001) {
			System.out.println('差值非常小，到我的规定精度，认为相等');
		}
	}
}