public class MulForTab2 {
	public static void main(String[] args){

		int c = 5;
		// ��ӡ���������
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("��ӡ���������");
		for (int i=1 ; i<=c ;i++ ) {
			for (int j=1;j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        System.out.println("��ӡ����������");

		// ��ӡ����������
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i=1 ; i<=c ;i++ ) {
			for (int z=c-i;z>0 ;z-- ) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// ��ӡ���Ľ�����
		//     *
		//    * *
		//   *   *       �����һ�������һ��
		//  *     *
		// *********
		System.out.println("��ӡ���Ľ�����");
		for (int i=1 ; i<=c ;i++ ) {
			for (int z=c-i;z>0 ;z-- ) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1 ; j++) {
				if (j != 1 && j != (i*2-1) && i!=c) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}