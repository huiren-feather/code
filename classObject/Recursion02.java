
// һ�����ӣ���һ������е�һ�룬���ٶ��һ�����Ժ�ÿ��Ҳ�����
// ������ʮ��ʱ�����ٳ�ʱ������ֻ��һ������
// �ʣ��������������
// ˼����
// 1. i=1 n= s/2-1;
// 2. i=2 n= n/2-1;
// ...  
// i=10 n=1;
public class Recursion02 {
	public static void main(String[] args){
		T t = new T();
		int res=t.Rec(1);
		System.out.println(res);
	}
}

class T {
	public int Rec(int i){
		if (i==10) {
			return 1;
		}else{
			return (Rec(i+1)+1)*2;
		}
	}
}