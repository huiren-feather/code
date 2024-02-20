public class While03{
	public static void main(String[] args){
		int num =  2;
		double sum = 1;
		while(num<=100){
			if (num%2 ==0) {
				sum-= (1.0/num);
			}else{
				sum+= (1.0/num);
			}
			
			num++;
		}
		System.out.println(sum);
		
	}
}