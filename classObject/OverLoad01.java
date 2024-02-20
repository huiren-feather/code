public class OverLoad01 {
	public static void main(String[] args){

	// 方法重载
	// 允许同一个类中，多个同名方法的存在，但要求形参列表（数量，位置，类型）不一致
	// 重载的好处
	// 1.减轻了起名的麻烦
	// 2.减轻了记名的麻烦
	// 细节：
	// 1.方法名称必须相同
	// 2.参数名无要求
	// 3.返回值无要求
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