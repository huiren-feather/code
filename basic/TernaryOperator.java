public class TernaryOperator{
	public static void main(String[] args){
		int a =  10;
		int b = 80;
		// ����㣬�ȷ����ڼ���
		int res =  a > b ? a++ : b--;
		System.out.println(res);

		int c = 40;
		// a,b,c���ֵ
		int max = c>(a>b?a:b) ? c :(a>b?a:b) ; //�Ƽ��𿪣������и��õķ���
		System.out.println("max= "+max);

		
	}
}