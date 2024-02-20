public class While02{
	public static void main(String[] args){
		int i= 1;
		int count =0;
		while(i>=1 && i<=100){
			if (i%5 != 0 ) {
				System.out.print(i+"\t");
				count++;
			}
			if (count % 5 ==0) {
				System.out.println();
			}
			i++;
		}
	}
}