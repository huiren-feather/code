import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		// ����
		// 1.˳�����
		// 2.���ֲ��ң�Ҫ���������
		// 
		
		// ˼·������
		// 1.����һ������
		// 2.�����û����룬�������飬��һ�Ƚϣ�����У����˳�
		
		String[] names={"��üӥ��","��ëʨ��","��������","��������"}; 
		Scanner myScanner = new Scanner(System.in);
		int index =-1;
		System.out.println("���������֣�");
		String findName = myScanner.next();
		for (int i=0;i<names.length ;i++ ) {
			if (findName.equals(names[i])) {
				System.out.println("��ϲ�����ҵ�"+findName);
				System.out.println("�±�Ϊ"+i);
				index=i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("�ܱ�Ǹ��δ�ҵ�" );
		}
	}
}
