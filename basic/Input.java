import java.util.Scanner;
public class Input {
	public static void main(String[] args){
		
		// �����û�������
		// Scanner�ࣺ���ı�ɨ��������java.util ��
		// 1.����Scanner�����ڵİ�
		// 2.����Scanner����ʵ�� myScanner
		// 3.�����û�����
		Scanner myScanner = new Scanner(System.in);

		System.out.println("���������֣�");
		String name =  myScanner.next();
		System.out.println("���������䣺");
		int age =  myScanner.nextInt();
		System.out.println("������нˮ��");
		double sal =  myScanner.nextDouble();
		System.out.println("�˵���Ϣ���£�");
		System.out.println("������"+ name + " ���䣺"+ age +
			" нˮ��"+ sal);
	}
}