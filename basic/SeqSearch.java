import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args){
		// 查找
		// 1.顺序查找
		// 2.二分查找：要求是有序的
		// 
		
		// 思路分析：
		// 1.定义一个数组
		// 2.接收用户输入，遍历数组，逐一比较，如果有，则退出
		
		String[] names={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"}; 
		Scanner myScanner = new Scanner(System.in);
		int index =-1;
		System.out.println("请输入名字：");
		String findName = myScanner.next();
		for (int i=0;i<names.length ;i++ ) {
			if (findName.equals(names[i])) {
				System.out.println("恭喜，已找到"+findName);
				System.out.println("下标为"+i);
				index=i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("很抱歉，未找到" );
		}
	}
}
