public class Work01 {
	public static void main(String[] args){
		T t = new T();
		double[] arr = {1.2,1.3,3,-3.1};
		Double max = t.max(arr);
		if (max !=null) {
			System.out.println("max = "+max);	
		}else {
			System.out.println("�����������鲻��Ϊnull ��{}" );	
			
		}


		String[] arr1 = {"aa","sf","sfda","asfasf","gbeaqwrhg"};
		String str = "gbeaqwrhg";	
		int index = t.find(arr1,str);
		System.out.println("�ҵ��������� "+index);

		double price = 12;
		System.out.println("�۸����Ϊ "+t.updatePrice(price));

		double[] arr2 = t.copyArr(arr);
		System.out.println("arr�ĵ�ַΪ "+arr +" arr2�ĵ�ַΪ "+arr2);

		Circle c = new Circle();
		System.out.println("Բ���ܳ�Ϊ "+c.girth(1));
		System.out.println("Բ���ܳ�Ϊ "+c.area(1));

	}
}

class T {
	// ��double�������ֵ
	// ���ﷵ��ֵ�� Double ��װ�� ���Ϳ��Լ��ݷ���ֵ
	public Double max(double[] arr){
		if( arr != null && arr.length>0)  {
			double temp=arr[0];
			for (int i=1;i<arr.length ;i++ ) {
				temp=temp>arr[i]?temp:arr[i];
			}
			return temp;
		}else{
			return null;
		}


	}

	public int find(String[] arr, String str){
		int index=-1;
		// �����ַ���������������
		for (int i=0;i<arr.length ;i++ ) {
			if(str.equals(arr[i])){
				index=i;
			}
		}
		return index;
	}

	public double updatePrice(double price){
		// ���ļ۸�
		if (price>150) {
			price=150;
		}else if(price>100){
			price=100;
		}
		return price;
	}

	public double[] copyArr(double[] arr){
		// ��������
		double[] arr1 = new double[arr.length];
		for (int i=0;i<arr.length ;i++ ) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
}

class Circle{
	// Բ�İ뾶���ܳ������
	double radius;
	public double girth(double radius){
		return 2*radius*Math.PI;
	}
	public double area(double radius){
		return radius*radius*Math.PI;
	}
}