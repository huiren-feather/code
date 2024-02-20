public class ForceConvert{
	public static void main(String[] args){

		int num =  (int)1.9;
		System.out.println(num); //精度损失

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println(b1); //数据溢出

		
	}
}