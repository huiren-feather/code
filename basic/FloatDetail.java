public class FloatDetail{
	public static void main(String[] args){

		// float num1 = 1.1;  //Ĭ����double�����Իᱨ�� 
		float num2 = 1.1F;
		double num3 = 1.1;
		double num4 = 1.1F;

		System.out.println(5.12e2);

		double num5 = 1.232142345234532432;
		float num6 = 1.232142345234532432F;

		System.out.println(num5);
		System.out.println(num6);

		// ������ʹ������
		// ����������С���Ľ�������ж�ʱ��Ҫע��
		// Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ�ڽ����ж�
		double num7 = 2.7;
		double num8 = 8.1/3;
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(Math.abs(num7-num8));
		if (Math.abs(num7-num8)<0.00001) {
			System.out.println('��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���');
		}
	}
}