public class Work01 {
	public static void main(String[] args){
		T t = new T();
		double[] arr = {1.2,1.3,3,-3.1};
		Double max = t.max(arr);
		if (max !=null) {
			System.out.println("max = "+max);	
		}else {
			System.out.println("输入有误，数组不能为null 或{}" );	
			
		}


		String[] arr1 = {"aa","sf","sfda","asfasf","gbeaqwrhg"};
		String str = "gbeaqwrhg";	
		int index = t.find(arr1,str);
		System.out.println("找到的索引是 "+index);

		double price = 12;
		System.out.println("价格更改为 "+t.updatePrice(price));

		double[] arr2 = t.copyArr(arr);
		System.out.println("arr的地址为 "+arr +" arr2的地址为 "+arr2);

		Circle c = new Circle();
		System.out.println("圆的周长为 "+c.girth(1));
		System.out.println("圆的周长为 "+c.area(1));

	}
}

class T {
	// 求double数组最大值
	// 这里返回值用 Double 包装类 ，就可以兼容返回值
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
		// 查找字符串。并返回索引
		for (int i=0;i<arr.length ;i++ ) {
			if(str.equals(arr[i])){
				index=i;
			}
		}
		return index;
	}

	public double updatePrice(double price){
		// 更改价格
		if (price>150) {
			price=150;
		}else if(price>100){
			price=100;
		}
		return price;
	}

	public double[] copyArr(double[] arr){
		// 复制数组
		double[] arr1 = new double[arr.length];
		for (int i=0;i<arr.length ;i++ ) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
}

class Circle{
	// 圆的半径、周长、面积
	double radius;
	public double girth(double radius){
		return 2*radius*Math.PI;
	}
	public double area(double radius){
		return radius*radius*Math.PI;
	}
}