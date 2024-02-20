import java.util.Scanner;
public class If01 {
	public static void main(String[] args){
		// 需求：若大于18岁，要对自己的行为负责
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("请对自己的行为完全负责！");
		}else{
			System.out.println("请学习对自己的行为负责！");
		}

		System.out.println("请输入分数：");
		double score =  myScanner.nextDouble();

		System.out.println("请输入性别：");
		char gender =  myScanner.next().charAt(0);

		if (score >= 8.0) {
			if (gender == '男') {
				System.out.println("进入男子组决赛");
			}else if (gender == '女') {
				System.out.println("进入女子组决赛");
			}else {
				System.out.println("性别未知，淘汰！！！");
			}
		}else{
			System.out.println("很遗憾，您被淘汰了。");
		}
	}
}