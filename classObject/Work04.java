// 有个人Tom 设计他的成员变量 成员方法 
// 用电脑猜拳，每次都会随机生成0，1,2
// 0表示石头 1表示简单 2表示布
// 并要显示Tom的输赢次数
// 
// 
import java.util.Scanner;
public class Work04{
	public static void main(String[] args){
		Stone s = new Stone();
		s.win();
	}
}
// 1.提示输入
// 2.人输入
// 3.产生随机数
// 4.进行比较，输出结果 输次数+1；若Tom赢，赢次数+1（这个用数组存）
// 5.提示是否继续游戏
// 6.人输入y/n
// 7.  若是y :重复第1步   若是n :结束循环，并提示游戏结束，输出 输赢次数
class Stone {
	char yn;
	int person;
	int computer;
	int winnum=0;
	int losenum=0;
	Scanner myScanner = new Scanner(System.in);
	public void win(){
		do{
			System.out.println("请输入石头剪刀布：");
			person=myScanner.nextInt();
			System.out.println("Tom的值是 "+person);
			computer=(int)(Math.random()*3);
			System.out.println("电脑的值是 "+computer);

			if (person==computer) {
				System.out.println("本次平局，Tom赢了 "+winnum+"次,输了"+losenum+"次");
			}else if(person==0 && computer==1 || person==1 && computer==2 ||
				person==2 && computer==0 ){
				winnum++;
				System.out.println("本次Tom赢，Tom赢了 "+winnum+"次,输了"+losenum+"次");
			}else if(person==0 && computer==2 || person==1 && computer==0 ||
				person==2 && computer==1 ){
				losenum++;
				System.out.println("本次电脑赢，Tom赢了 "+winnum+"次,输了"+losenum+"次");
			}else{
				System.out.println("Tom ，输入错误");
			}
			System.out.println("是否继续游戏：y/n");
			yn=myScanner.next().charAt(0);
		}while(yn=='y');
		System.out.println("游戏结束");
	} 
}