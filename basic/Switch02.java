import java.util.Scanner;
public class Switch02 {
	public static void main(String[] args){
		Scanner myScanner =  new Scanner(System.in);
		// char c =  myScanner.next().charAt(0);
		// char c1 =' ' ;
		// switch(c){
		// 	case 'a':
		// 		c1='A';
		// 		break;
		// 	case 'b':
		// 		c1='B';
		// 		break;
		// 	case 'c':
		// 		c1='C';
		// 		break;
		// 	case 'd':
		// 		c1='D';
		// 		break;
		// 	case 'e':
		// 		c1='E';
		// 		break;
		// 	default:
		// 		System.out.println("other");
		// }
		// if (c1 != ' ') {
		// 	System.out.println(c1);
		// }

		// double d =  myScanner.nextDouble();
		// String str = "";
		// // 布尔值不能用
		// switch((int)(d/60)){
		// 	case 1:
		// 		str = "合格";
		// 		break;
		// 	case 0:
		// 		str = "不合格";
		// 		break;
		// 	default:
		// 		str = "输入无效";
		// }
		// System.out.println(str);
		System.out.println("请输入月份：");
		int  month =  myScanner.nextInt();
		String str1 = "";
		switch(month){
			case 3:
			case 4:
			case 5:
				str1 = "春季";
				break;
			case 6:
			case 7:
			case 8:
				str1 = "夏季";
				break;
			case 9:
			case 10:
			case 11:
				str1 = "秋季";
				break;
			case 12:
			case 1:
			case 2:
				str1 = "冬季";
				break;
			default:
				str1 = "无此月份";
		}
		System.out.println("现在季节是："+str1);
	}
}