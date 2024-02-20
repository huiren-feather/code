public class YangHui{
	public static void main(String[] args){
		// �������
		// 1.��һ����1��Ԫ�أ���n����n ��Ԫ��
		// 2.ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
		// 3.�ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�ֵ��
		// arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		// 
		int yanghui[][] =new int[10][];
		for (int i=0;i<yanghui.length ;i++ ) {
			yanghui[i]=new int[i+1];
			for (int j=0;j<yanghui[i].length ;j++ ) {
				if (j==0 || j==yanghui[i].length-1) {
					yanghui[i][j]=1;
				}else {
					yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
				}
			}
		}

		for (int i=0 ;i<yanghui.length ;i++ ) {
			for (int j=0;j<yanghui[i].length ;j++ ) {
				System.out.print(yanghui[i][j]+" ");
			}
			System.out.println();
		}

		//��Ȼ��ֵ���ǵ�ַ�����Ƕ�ά���黹�ǲ��ܸ���һά���� ��why����
		int a[]=new int[10];
		System.out.println(a);
		System.out.println(yanghui);
		// �����ַ�����ǲ�һ���ģ���Ҫԭ���ǣ���ֵ��a�Ͳ���һά������
		// a=yanghui;
	}

}