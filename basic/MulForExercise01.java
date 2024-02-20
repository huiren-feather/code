import java.util.Scanner;
public class MulForExercise01 {
	public static void main(String[] args){
		double sum2 = 0;
		Scanner myScanner = new Scanner(System.in);
		int c = 0;
		for (int i=0;i<3 ;i++ ) {
			
			double sum =0;
			double a =0;
			for (int j=0 ;j<5 ;j++ ) {
				a = myScanner.nextInt();
				sum+=a;
				if (a>=60) {
					c++;
				}
			}
			System.out.println(i+1+" 班的平均分是 "+ (sum/5));
			sum2 += sum;
		}
		System.out.println("所有班级平均分是 " + (sum2/3/5));
		System.out.println("及格人数为 " + c);
	}
}