public class StringToBasic{
	public static void main(String[] args){
		int num =  1;
		double d1 = 80.1;
		float f1 = 1.1F;
		boolean b1 = true;

		// 基本类型转String  + ""
		String s1 = num + "";
		String s2 = d1 + "";
		String s3 = f1 + "";
		String s4 = b1 + "";
		System.out.println(s1+s2+s3+s4);

		//String 转 基本类型,通过基本类型的包装类调用parseXX方法
		String s5 = "123";
		int num1 =  Integer.parseInt(s5);
		double d2 = Double.parseDouble(s5);
		float f2 = Float.parseFloat(s5);
		long l2 = Long.parseLong(s5);
		byte b2 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num3 = Short.parseShort(s5);

		System.out.println(s5);	
		System.out.println(num1);	
		System.out.println(d2);	
		System.out.println(f2);	
		System.out.println(l2);	
		System.out.println(b2);	
		System.out.println(b );	
		System.out.println(num3);	

		// 字符串 --》 字符   取出字符串中 的某个字符
		System.out.println(s5.charAt(0));	
		System.out.println(s5.charAt(1));	
		System.out.println(s5.charAt(2));	
		
	}
}