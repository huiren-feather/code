public class AssignOperator{
	public static void main(String[] args){
		// assign :分配，即赋值
		// 赋值运算符
		// 
		// 复合赋值运算符会进行类型转换
		byte b =3 ;
		b+=2;  //等价  b=(byte)(b+2); 所以不会报错
		System.out.println(b);
	}
}