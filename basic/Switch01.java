import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		Scanner myScanner  = new Scanner(System.in);

		char c =  myScanner.next().charAt(0);
		String str="" ;
		switch(c){
			case 'a':str = "����һ"; break;
			case 'b':str = "���ڶ�"; break;
			case 'c':str = "������"; break;
			case 'd':str = "������"; break;
			case 'e':str = "������"; break;
			case 'f':str = "������"; break;
			case 'g':str = "������"; break;
			default : str = "�������";
		}

		System.out.println(str);		
	}
}
