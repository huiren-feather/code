public class Daffodils{
	public static void main(String[] args){
		int daffodils= 153;
		int a = daffodils%10;
		int temp = daffodils/10;
		int b = temp%10;
		int c = temp / 10;

		if (a*a*a +b*b*b +c*c*c == daffodils) {
			System.out.println("������һ��ˮ�ɻ���");
		}else{
			System.out.println("��������һ��ˮ�ɻ���");

		}
	}
}