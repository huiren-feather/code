import java.util.Scanner;
public class ArrayAdd02 {
	public static  void main(String[] args){
		// ��������
		
		// {1,2,3}  -->  {1,2,3,4}
		// ˼·������
		// 1.����һ�������� ������ΪԪ���鳤�ȼ�����Ҫ����ĳ���
		// 2.���α���ԭ���飬��ֵ������������
		// 3.�������Ԫ�����θ�ֵ��������
		// 4.�����ԭ����ָ�������飬ԭ����ͱ�������
		// 5.����һ��Scanner���Խ����û�����
		// 6.��Ϊ�û�ʲôʱ���˳���ȷ����ʹ��do-while + break ������
		Scanner myScanner = new Scanner(System.in);
		int arr[] = {1,2,3};

		do{
			int arrNew[] = new int[arr.length+1];
			// ����ԭ���飬�����ݿ�����������
			for (int i=0;i<arr.length ; i++) {
				arrNew[i]=arr[i];
			}
			// ����һ������
		 	System.out.println("��������Ҫ��ӵ�Ԫ�أ�");
			int addNum=myScanner.nextInt();
			// ����������ݸ�������������һ��λ��
			arrNew[arrNew.length-1]=addNum;
 			// �������Ч��
			arr=arrNew;
			for (int i=0;i<arr.length ; i++) {
				System.out.print(arr[i]+"\t");
			}
			// ���û��Ƿ����
			System.out.println("\n�Ƿ�������룺y/n");
			char judge = myScanner.next().charAt(0); 
			if (judge == 'n') {
				System.out.println("�����������");
				break;
			}
		}while(true);

	}
}