public class LogicOperator01{
	public static void main(String[] args){
		int age = 50  ;
		if (age>20 && age<30) {
			System.out.println("Ok1");
		}
		if (age>20 & age<30) {
			System.out.println("Ok2");
		}
		// ��·��&& �������һ������Ϊfalse���������������ִ��
		// �߼���& �������һ������Ϊfalse�������������Ȼ��ִ��
		// ���ö�·�룬Ч�ʽϸ�
		int a = 4;
		int b = 9;
		// if (a < 1 & ++b <50) {
		// 	System.out.println("OK3");
		// }
		// System.out.println("a=" + a + " b=" + b); //b=10

		// if (a < 1 && ++b <50) {
		// 	System.out.println("OK3");
		// }
		// System.out.println("a=" + a + " b=" + b); //b=9
		
		// ��·��|| �������һ������Ϊtrue���������������ִ��
		// �߼���| �������һ������Ϊtrue�������������Ȼ��ִ��
		// ���ö�·��Ч�ʽϸ�
		
		if (a < 1 || ++b <50) {
			System.out.println("OK3");
		}
		System.out.println("a=" + a + " b=" + b); //b=9

		if (a < 1 | ++b <50) {
			System.out.println("OK3");
		}
		System.out.println("a=" + a + " b=" + b); //b=10

		// ȡ�� ��
		// ��� ^  ���߲�ͬʱΪtrue����֮Ϊfalse
		System.out.println(!(60>20));
		// System.out.println(!20);//�������ֻ�ܶ�Booleanֵ������


		System.out.println((60>20)^(60<30));
		System.out.println((60>20)^(60>30));

		// 
		boolean x=true;
		boolean y=true;
		short  num  = 1;
		short z=46;
		//  true        true
		if ((z++==46)&&(y=true)) {
			z++;
		}
		//    false      true
		if ((x=false)||(++z==49)) {
			z++;
		}
		System.out.println("z= "+z);  //�����ж϶�Ϊ�棬50

		// ��ֵ���ķ��ؽ��Ϊ������ֵ
		System.out.println(z=49);
		System.out.println(z=num);

	}
}