// break �������ڶ��Ƕ�׵�������ʱ��
// ����ͨ����ǩֻ��Ҫ��ֹ������һ������

// ����ʵ�ʿ����У�������Ҫʹ�ñ�ǩ
// ��Ϊ��ʹ����Ŀɶ��Ը���
// 
// 
// equals   �Ƚ��ַ����Ƿ�һ��
// �Ƽ���ʵ��ֵд��ǰ�棬����д�ں�ߣ����Ա����ָ��  
// "�ֱ���".equals(name);
public class Break01 {
	public static void main(String[] args){
		int i,j=0;
		lable1:
		for (i=1;i<10 ;i++ ) {
			lable2:
			for (j=1; j<5 ; j++ ) {
				// if (i==2) {
				// 	break lable1;
				// }
				// if (j== 4) {
				// 	break lable1;
				// }
				if (i== 4) {
					System.out.println("�����ڲ�ѭ��");
					break ;

				}
			}
		}
		System.out.print("i = " + i + ", j = " + j);
	}
}