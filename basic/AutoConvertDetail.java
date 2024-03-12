public class AutoConvertDetail{
	public static void main(String[] args){
		// 多种数据类型混合运算时，
		// 系统会首先自动将所有数据转换成容量最大的那种数据类型，然后在计算
		int num =  10;
		double d1 = num+1.1; 
		float d1 = num+1.1;  //报错

		// short，byte  和 char之间不会自动转换
		// 当把具体数赋值给byte时，先判断数是否在byte范围内，如果是就可以
		// 如果是变量赋值，判断类型
		byte b1 = 10;  //对的，-128 - 127
		int n2 =  1;
		byte b2 = n2;  //报错

		//  short，byte ，char之间可以计算，在计算时首先转换成int型
		byte b2 = 1;
		short s1 = 1;
		short s2 = b2 + s1; //报错

		// Boolean不参与转换
		boolean pass  = true;
		int num3 =  pass ; //报错

		// 自动提升原则：表达式结果的类型自动提升为 操作数中最大的类型
		
	}
}