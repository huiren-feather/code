import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
// ��Ҫ���յ�

// 1�������ʹ�ã�����������
// 2��Ҫ��ס����һ����������С���޷��ı����
// 3��ð������
		// ���飺���Դ�Ŷ�� ͬһ���͵����ݡ�
		// ���壺
		// 1���������� ������[] = new ��������[����];
		// int a[] =  new int[];
		// 2����̬��ʼ��()
		// ���������������� ������[]   ��  ��������[] ������
		// int a[];     int[] a;
		// �ٴ������飺 ������ = new ��������[����];
		// a = new int[10];
		// 
		// ��0��ʼ���
		// double���͵�����  double[]  
		// ������.length  ��ȡ����ĳ���
		double[] hens =  {3,5,1,3.4,2,50};

		// �������飬���
		double sum=0;
		for (int i=0;i<hens.length;i++) {
			System.out.println("��"+(i+1)+"��Ԫ�ص�ֵ��"+ hens[i]);
			sum+=hens[i];
		}
		System.out.println("�����"+ sum);
		System.out.println("ƽ��ֵ��"+ sum/hens.length);
		System.out.println("���鳤����"+ hens.length);

		Scanner myScanner = new Scanner(System.in);
		double scores[] = new double[5];
		for (int i= 0;i<scores.length ;i++ ) {
			System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ");
			scores[i]=myScanner.nextDouble();
		}

		// �������������
		System.out.println("��ǰ�����Ԫ�أ�");
		for (int i=0;i<scores.length ;i++ ) {
			System.out.println("��"+(i+1)+"��Ԫ�ص�ֵ"+scores[i]);
		}
	}
}