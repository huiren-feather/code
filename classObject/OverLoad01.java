public class OverLoad01 {
	public static void main(String[] args){

	// ��������
	// ����ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ���β��б�������λ�ã����ͣ���һ��
	// ���صĺô�
	// 1.�������������鷳
	// 2.�����˼������鷳
	// ϸ�ڣ�
	// 1.�������Ʊ�����ͬ
	// 2.��������Ҫ��
	// 3.����ֵ��Ҫ��
	MyCalculator mc =new MyCalculator();
	System.out.println(mc.calculator(1.0,2));
	}
}

class MyCalculator {
	public int calculator(int n1,int n2){
		return n1+n2;
	}

	public double calculator(int n1,double n2){
		return n1+n2;
	}

	public double calculator(double n1,int n2){
		return n1+n2;
	}
	public int calculator(int n1,int n2,int n3){
		return n1+n2+n3;
	}
}