import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args){
		// ��������
		// 1.ѭ������ǰlength-1��Ԫ�ظ�ֵ��������,�ٰ�ԭ����ָ��������
		// 2.��ʾ���Ƿ������ӣ����ǣ�������һ��ѭ����ִ�в���1����������ѭ��
		// 3.�������������
		int arr[] = {1,2,3,4,5};
		Scanner myScanner = new Scanner(System.in);
		do{
			int arrNew[] = new int[arr.length-1];
			for (int i=0;i<arr.length-1 ;i++ ) {
				arrNew[i]=arr[i];
			}
			arr=arrNew;
			for (int i=0;i<arr.length ;i++ ) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println("\n�Ƿ����������y/n");
			char judge = myScanner.next().charAt(0);
			if (judge == 'n') {
				System.out.println("\nֹͣ����");
				break;
			}
			if (arr.length == 1) {
				System.out.println("\nֻʣһ��Ԫ�أ���������");
				break;
			}
		}while(arr.length>1);

	}
}