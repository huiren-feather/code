
// �Թ�����
// 1.С��õ���·�����ͳ���Ա���õ���·�����йأ���·���������ҵ�˳�����
// 2.�ٵõ�С��·��ʱ��������ʹ�ã��������󣩣��ٸĳɣ��������󣩣�����·���Ƿ��б仯
// 3.���Ի�������
// 4.��չ˼�������������·��


public class Recursion03 {
	public static void main(String[] args){
 		// ˼·
 		// 1.�ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7]
 		// 2.�ȹ涨 map �����Ԫ��ֵ��0 ��ʾ������ 1 ��ʾ�ϰ���
		int[][] map =new int[8][7];
		// 3.���������һ�к��������һ�У�ȫ������Ϊ1
		for (int i=0;i<7 ;i++ ) {
			map[0][i]=1;
			map[7][i]=1;
		}
		// 4.����һ�к����һ�У�ȫ�����ó�1
		for (int i=0;i<8 ;i++ ) {
			map[i][0]=1;
			map[i][6]=1;
		}
		// 5.�����ϰ���Ϊ1
		map[3][1]=map[3][2]= 1;
		for (int i=0;i<map.length ; i++) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
 		
 		T t = new T();
 	// 	t.findway(map,1,1);
		
		// System.out.println("��·��ĵ�ͼ");

		// for (int i=0;i<map.length ; i++) {
		// 	for (int j=0;j<map[i].length ;j++ ) {
		// 		System.out.print(map[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		t.findway2(map,1,1);
		
		System.out.println("�ı���Ժ���·��ĵ�ͼ");

		for (int i=0;i<map.length ; i++) {
			for (int j=0;j<map[i].length ;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
}
 
 

class T {
	// ʹ�õݹ���ݵ�˼�������������Թ�
	// ���
	// 1.findway��������ר�����ҳ��Թ���·��
	// 2.����ҵ�������true�����򷵻�false
	// 3.map���Ƕ�ά���飬����ʾ�Թ�
	// 4.i,j���������λ�ã���ʼ��Ϊ��1,1��������Ϊ�˴���������������
	// 5.��Ϊ�����ǵݹ���·���������ȹ涨map����ĸ���ֵ�ĺ��壺
	//   0 ��ʾ������ 1��ʾ�ϰ��� 2��ʾ�߹� 3��ʾ�߹����߲�ͨ
	// 6.��map[6][5]=2 ��˵���ҵ�ͨ·���Ϳ��Խ��������������
	// 7.��ȷ����ʱ��·���� ��--> ��--> ��--> �� 
	public boolean findway(int[][] map , int i,int j){
		if (map[6][5]==2) {
			return true;
		}else{
			if (map[i][j]==0) {//ֻ��0��ʾ������
				map[i][j]=2;
				// ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				if (findway(map,i+1,j)) {
					return true;
				}else if (findway(map,i,j+1)) {
					return true;
				}else if (findway(map,i-1,j)) {
					return true;
				}else if (findway(map,i,j-1)) {
					return true;
				}else{
					map[i][j]=3;
					return false ;
			    }	
			}else{// 1,2,3���޷�����
				return false ;
			}	
		} 
	}

	// �ı���·���ԣ� ��������
	public boolean findway2(int[][] map , int i,int j){
		if (map[6][5]==2) {
			return true;
		}else{
			if (map[i][j]==0) {//ֻ��0��ʾ������
				map[i][j]=2;
				// ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
				if (findway2(map,i-1,j)) {
					return true;
				}else if (findway2(map,i,j+1)) {
					return true;
				}else if (findway2(map,i+1,j)) {
					return true;
				}else if (findway(map,i,j-1)) {
					return true;
				}else{
					map[i][j]=3;
					return false ;
			    }	
			}else{// 1,2,3���޷�����
				return false ;
			}	
		} 
	}
}