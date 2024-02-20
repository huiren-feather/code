public class Work03{
	public static void main(String[] args){
		PassObject po = new PassObject();
		Circle c = new Circle();
		po.printAreas(c,5);
	}
}

class Circle{
	double radius ;
	public double findArea(double radius){
		return Math.PI * radius *radius;
	}
}

class PassObject{
	public void printAreas(Circle c,int times){
		if (times<1) {
			System.out.println("�������󣬰뾶С��1");
		}
		for (int i=1;i<=times ;i++ ) {

			System.out.println("�뾶Ϊ "+i+" ��Ӧ��Բ���Ϊ "+ c.findArea(i));
		}
	}
}