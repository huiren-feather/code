public class For01 {
	public static void main(String[] args){
		int sum = 0 ;
		int i=1;
		for (;(i*9)<=100 ;i++ ) {
			sum += i*9;
			System.out.println( "9�ı�����"+i*9);
		}
		--i;
		System.out.println("����Ϊ:"+i);
		System.out.println("�ܺ�Ϊ"+sum);
	}
}
// 1.����Ϊ��
// ������1-100
// ���9�ı��������й���
// ͳ�Ƹ��� ����һ������ int count = 0������������ʱ count++