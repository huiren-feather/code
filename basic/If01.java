import java.util.Scanner;
public class If01 {
	public static void main(String[] args){
		// ����������18�꣬Ҫ���Լ�����Ϊ����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������䣺");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("����Լ�����Ϊ��ȫ����");
		}else{
			System.out.println("��ѧϰ���Լ�����Ϊ����");
		}

		System.out.println("�����������");
		double score =  myScanner.nextDouble();

		System.out.println("�������Ա�");
		char gender =  myScanner.next().charAt(0);

		if (score >= 8.0) {
			if (gender == '��') {
				System.out.println("�������������");
			}else if (gender == 'Ů') {
				System.out.println("����Ů�������");
			}else {
				System.out.println("�Ա�δ֪����̭������");
			}
		}else{
			System.out.println("���ź���������̭�ˡ�");
		}
	}
}