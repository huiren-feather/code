import java.util.Scanner;
public class Input {
	public static void main(String[] args){
		
		// 接受用户的输入
		// Scanner类：简单文本扫描器，在java.util 包
		// 1.引入Scanner类所在的包
		// 2.创建Scanner对象实例 myScanner
		// 3.接受用户输入
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入名字：");
		String name =  myScanner.next();
		System.out.println("请输入年龄：");
		int age =  myScanner.nextInt();
		System.out.println("请输入薪水：");
		double sal =  myScanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("姓名："+ name + " 年龄："+ age +
			" 薪水："+ sal);
	}
}