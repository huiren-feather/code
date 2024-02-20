public class LogicOperator01{
	public static void main(String[] args){
		int age = 50  ;
		if (age>20 && age<30) {
			System.out.println("Ok1");
		}
		if (age>20 & age<30) {
			System.out.println("Ok2");
		}
		// 短路与&& ：如果第一个条件为false，后面的条件不在执行
		// 逻辑与& ：如果第一个条件为false，后面的条件仍然会执行
		// 常用短路与，效率较高
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
		
		// 短路或|| ：如果第一个条件为true，后面的条件不在执行
		// 逻辑或| ：如果第一个条件为true，后面的条件仍然会执行
		// 常用短路或，效率较高
		
		if (a < 1 || ++b <50) {
			System.out.println("OK3");
		}
		System.out.println("a=" + a + " b=" + b); //b=9

		if (a < 1 | ++b <50) {
			System.out.println("OK3");
		}
		System.out.println("a=" + a + " b=" + b); //b=10

		// 取反 ！
		// 异或 ^  两边不同时为true；反之为false
		System.out.println(!(60>20));
		// System.out.println(!20);//报错这个只能对Boolean值起作用


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
		System.out.println("z= "+z);  //两个判断都为真，50

		// 赋值语句的返回结果为所赋的值
		System.out.println(z=49);
		System.out.println(z=num);

	}
}