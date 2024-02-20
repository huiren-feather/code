// break 语句出现在多层嵌套的语句块中时，
// 可以通过标签只买要终止的是哪一层语句块

// 但在实际开发中，尽量不要使用标签
// 因为会使代码的可读性更差
// 
// 
// equals   比较字符串是否一样
// 推荐把实际值写在前面，变量写在后边，可以避免空指针  
// "贾宝玉".equals(name);
public class Break01 {
	public static void main(String[] args){
		int i,j=0;
		lable1:
		for (i=1;i<10 ;i++ ) {
			lable2:
			for (j=1; j<5 ; j++ ) {
				// if (i==2) {
				// 	break lable1;
				// }
				// if (j== 4) {
				// 	break lable1;
				// }
				if (i== 4) {
					System.out.println("跳出内层循环");
					break ;

				}
			}
		}
		System.out.print("i = " + i + ", j = " + j);
	}
}