public class Random01{
	public static void main(String[] args){


		// ������� 1-100������
		// (int)(Math.random()*100)+1
		for (int i = 0; i<=10 ;i++ ) {
			System.out.println((int)(Math.random()*100)+1);
		}
		int a,j=0;
		while(true){
			a= (int)(Math.random()*100)+1;
			j++;
			System.out.println(a);
			if (a == 97) {
				break;
			}
		}
		System.out.println("����� "+ j + "��");
	}
}