public class Methods01 {
	public static void main(String[] args){
		AA a = new AA();
		int n =2;
		boolean b = a.Judge(n);
		System.out.println(b);

		BB bb = new BB();
		int r =3,col=6;
		char c = '@';
		bb.print(r,col,c);
	}
}

class AA {
	public boolean Judge(int num) {
		boolean b ;
		if (num%2 == 0) {
		 	b=true;
		 }else {
		 	b= false;
		 }
		return b;
	}
}

// ����˼·��
// 1.�����ķ�������void 
// 2.����������
// 3.�������β�  
// 4.�����壬ѭ��
// 
class BB {
	public void print(int row,int col,char c){
		for (int i=0;i<row ; i++) {
			for (int j=0;j<col ;j++ ) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}

// �����Ĵ��λ��ƣ�
// 
// �����������ͣ�
// �βε��κθı䲻Ӱ��ʵ��
// 
// �����������ͣ�
// �����ǵ�ַ������ʵ�κ��β�ͬ���仯