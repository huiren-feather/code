public class Array04 {
	public static void main(String[] args){
		// ˼·
		// 1.����10��������������浽����
		// �������飬ѭ���������飬ÿ����һ����������ͱ��浽����
		int arr[] = new int [10];
		int random;
		for (int i=0;i<arr.length ;i++ ) {
			random = (int)(Math.random()*100)+1;
			arr[i]=random;
		}
		for (int i=0 ;i<arr.length ;i++ ) {
			System.out.print(arr[i]+"\t");
		}
		// 2.�����ӡ�Լ���ƽ��ֵ�����ֵ�����ֵ�±ꡢ�������Ƿ���8
		// �����ӡ��ð�����򣬵�i�ֱȽ�length-i�������Ƚ�length-1��
		// ���ֵ���ǵ�һ�������±�Ϊ0
		// �����Ƿ�8��������������������б������Ƚ��Ƿ����8��
		// ���ǣ����������񣬱Ƚ��Ƿ����8�����ǣ���ʾ��8�����˳�ѭ��
		// ������ʾ��8�����˳�ѭ��
		int temp=-1 ;
		for (int i=0;i<arr.length-1 ;i++ ) {
			for (int j=0;j<arr.length-i-1 ;j++ ) {
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}			
		System.out.println("\n������������飺");
		int index =-1;
		int sum =0;
		for (int i=0 ;i<arr.length ;i++ ) {
			if (arr[i]==8) {
				index =i;
			}
			sum+=arr[i];
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n���ֵ��"+arr[0]+",�±���0");
		System.out.println("ƽ��ֵֵ��"+(sum/arr.length));
		if (index!=-1) {
			System.out.println("��������8���±�Ϊ"+arr[index]);
		}else{
			System.out.println("��������8 " );

		}
		

	}
}