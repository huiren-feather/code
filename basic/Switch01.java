import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		Scanner myScanner  = new Scanner(System.in);

		char c =  myScanner.next().charAt(0);
		String str="" ;
		switch(c){
			case 'a':str = "星期一"; break;
			case 'b':str = "星期二"; break;
			case 'c':str = "星期三"; break;
			case 'd':str = "星期四"; break;
			case 'e':str = "星期五"; break;
			case 'f':str = "星期六"; break;
			case 'g':str = "星期七"; break;
			default : str = "输入错误";
		}

		System.out.println(str);		
	}
}
