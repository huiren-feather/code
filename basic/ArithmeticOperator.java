public class ArithmeticOperator{
	public static void main(String[] args){
		System.out.println(10 / 4); //2
		System.out.println(10.0/4); // 2.5

// ȡģ % �� a%b= a- (int)a/b*b
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1

		// a- a/b*b = -10.5+10/3*3
		System.out.println(-10.5 % 3); //-1.5



// ��������n=i++ :��ʹ����ʱ����  1.temp=i;2.i=i+1;3.n=temp;
// ��������n=++i :��ʹ����ʱ����  1.i=i+1;2.temp=i;3.n=temp;
		int j=10;
		int i=10;
		System.out.println(j++); //10
		System.out.println(++i); //11

		int n=10;
		n=n++;
		System.out.println(n); //10


	}
}