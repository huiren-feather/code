public class MulForTab2 {
	public static void main(String[] args){

		int c = 5;
		// 打印半个金字塔
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println("打印半个金字塔");
		for (int i=1 ; i<=c ;i++ ) {
			for (int j=1;j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        System.out.println("打印整个金字塔");

		// 打印整个金字塔
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i=1 ; i<=c ;i++ ) {
			for (int z=c-i;z>0 ;z-- ) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 打印空心金字塔
		//     *
		//    * *
		//   *   *       输出第一个和最后一个
		//  *     *
		// *********
		System.out.println("打印空心金字塔");
		for (int i=1 ; i<=c ;i++ ) {
			for (int z=c-i;z>0 ;z-- ) {
				System.out.print(" ");
			}
			for (int j=1;j<=i*2-1 ; j++) {
				if (j != 1 && j != (i*2-1) && i!=c) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}